package com.siliconstack.stockcheck.view.ui.scan

import android.Manifest
import android.annotation.SuppressLint
import android.app.ActionBar
import android.app.Activity
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.databinding.adapters.ViewGroupBindingAdapter.setListener
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.Fragment
import android.support.v4.content.FileProvider
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.afollestad.materialdialogs.MaterialDialog
import com.bol.instantapp.exception.NoNetworkException
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.api.client.extensions.android.json.AndroidJsonFactory
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.services.vision.v1.Vision
import com.google.api.services.vision.v1.VisionRequestInitializer
import com.google.api.services.vision.v1.model.*
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.orhanobut.logger.Logger
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.AppApplication.Companion.gson
import com.siliconstack.stockcheck.BuildConfig
import com.siliconstack.stockcheck.PreferenceSetting
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.config.Config
import com.siliconstack.stockcheck.config.Constant
import com.siliconstack.stockcheck.databinding.ScanActivityBinding
import com.siliconstack.stockcheck.model.*
import com.siliconstack.stockcheck.view.adapter.FilterListAdapter
import com.siliconstack.stockcheck.view.eventbus.MainEventBus
import com.siliconstack.stockcheck.view.helper.DialogHelper
import com.siliconstack.stockcheck.view.ui.base.BaseActivity
import com.siliconstack.stockcheck.view.utility.DateUtility
import com.siliconstack.stockcheck.view.utility.Utility
import com.siliconstack.stockcheck.viewmodel.MainViewModel
import com.siliconstack.stockcheck.viewmodel.ScanViewModel
import com.tbruyelle.rxpermissions2.RxPermissions
import com.theartofdev.edmodo.cropper.CropImage
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import es.dmoral.toasty.Toasty
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.collections.forEachReversedWithIndex
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.uiThread
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern
import javax.inject.Inject
import kotlin.collections.ArrayList


class ScanCarActivity : BaseActivity(), HasSupportFragmentInjector  {


    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    lateinit var scanCarActivityBinding: com.siliconstack.stockcheck.databinding.ScanCarActivityBinding
    lateinit var scanViewModel:ScanViewModel

    override fun supportFragmentInjector() = dispatchingAndroidInjector
    private val imagePath:String? by lazy {
        intent.getStringExtra("url")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        initViewBinding()
        setTranslucentToolbar()

        setListener()
        initInfo()

    }

    private fun initViewBinding() {
        scanCarActivityBinding = DataBindingUtil.setContentView(this, R.layout.scan_car_activity)
        //mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        scanViewModel = ViewModelProviders.of(this, viewModelFactory).get(ScanViewModel::class.java)
      //  AppApplication.appComponent.injectViewModel(mainViewModel)
        AppApplication.appComponent.injectViewModel(scanViewModel)

    }

    private fun setListener(){

    }


    private fun initInfo(){
        imagePath?.let {
            val bitmap=Utility.decodeImageFromFiles(it,600,400)
            scanCar(bitmap)
        }

    }


    private fun scanCar(bitmap: Bitmap){
        progressDialog.show()
        val carModel=CarModel()
        val googleVisionRequest=GoogleVisionRequest()
        val request=GoogleVisionRequest.Request()
        request.features= arrayListOf(GoogleVisionRequest.Feature("WEB_DETECTION"),GoogleVisionRequest.Feature("IMAGE_PROPERTIES"))
        val image=GoogleVisionRequest.Image(Utility.convertBitmapToBase64(bitmap))
        request.image=image
        googleVisionRequest.requests= arrayListOf(request)
        scanViewModel.getGoogleVision( BuildConfig.GOOGLE_VISION_URL+ (Utility.getMetaData(this,"com.google.android.geo.API_KEY")?:""),googleVisionRequest).observe(this, android.arch.lifecycle.Observer { resource: Resource<BaseApiResponse>? ->
            progressDialog.dismiss()
            if (resource != null) {
                when (resource.status) {
                    Resource.Status.SUCCESS -> {
                        val response= resource.data as GoogleVisionResponse
                        response.responses?.forEach {
                            //setcolor
                            val color=it?.imagePropertiesAnnotation?.dominantColors?.colors?.getOrNull(0)?.color
                            color?.let { it: GoogleVisionResponse.Response.ImagePropertiesAnnotation.DominantColors.Color.Color ->
                                setCarColor(it.red?:0,it.green?:0,it.blue?:0,carModel)
                            }
                            //set full image
                            carModel.fullImageURL=it?.webDetection?.fullMatchingImages?.getOrNull(0)?.url
                            if(carModel.fullImageURL.isNullOrBlank())
                                carModel.fullImageURL=it?.webDetection?.visuallySimilarImages?.getOrNull(0)?.url

                            //get detail
//                            val descArr= it?.webDetection?.bestGuessLabels?.getOrNull(0)?.label?.split(" ") ?: arrayListOf()
//                            if (descArr.size > 1) {
//                                carModel.desc=it?.webDetection?.bestGuessLabels?.getOrNull(0)?.label
//                                //get year
//                                val pattern = Pattern.compile("(?s).*?" +
//                                        ".*" +
//                                        "(\\d{4})" +
//                                        ".*")
//                                val matcher = pattern.matcher(it?.webDetection?.bestGuessLabels?.getOrNull(0)?.label)
//                                if (matcher.matches()) {
//                                    carModel.year = matcher.group(1)
//                                    (descArr as ArrayList<String>).remove(carModel.year!!.toString())
//                                }
//                                //get make
//                                getMakesAPI(descArr as ArrayList<String>,carModel)
//                            }

                            //using first 1
                            run loop1@{
                                it?.webDetection?.webEntities?.forEach { it: GoogleVisionResponse.Response.WebDetection.WebEntity? ->
                                    val descArr= it?.description?.split(" ") ?: arrayListOf()
                                    if (descArr.size > 1) {
                                        carModel.desc=it?.description
                                        //get year
                                        val pattern = Pattern.compile("(?s).*?" +
                                                ".*" +
                                                "(\\d{4})" +
                                                ".*")
                                        val matcher = pattern.matcher(it?.description)
                                        if (matcher.matches()) {
                                            carModel.year = matcher.group(1)
                                            (descArr as ArrayList<String>).remove(carModel.year!!.toString())
                                        }
                                        //get make
                                        getMakesAPI(descArr as ArrayList<String>,carModel)
                                        return@loop1
                                    }
                                }
                            }
                        }


                    }
                    Resource.Status.ERROR -> {
                        Logger.d(resource.exception?.exceptin?.message?:"")
                        Toasty.error(this@ScanCarActivity,resource.exception?.exceptin?.message?:"").show()

                    }
                }
            }
        })
    }

    private fun setCarColor(red:Int,green:Int,blue:Int,carModel: CarModel){
        val hexColor = String.format("#%02x%02x%02x", red, green, blue)
        carModel.color=hexColor
    }

    private fun getMakesAPI(descArr:ArrayList<String>,carModel: CarModel){
        progressDialog.show()
        scanViewModel.getMake().observe(this,android.arch.lifecycle.Observer { resource: Resource<BaseApiResponse>? ->
            progressDialog.dismiss()
            if(resource!=null){
                when (resource.status) {
                    Resource.Status.SUCCESS -> {
                        var makes=resource.data as List<String>
                        run loop@{
                            descArr.forEach { it: String ->
                                if (makes.stream().anyMatch { x -> x.equals(it.trim(), true) }) {
                                    carModel.make = it
                                    return@loop
                                }
                            }
                        }
                        if(!carModel.make.isNullOrBlank()) {
                            descArr.remove(carModel.make!!)
                            getModelAPI(descArr, carModel)
                        }
                    }
                    Resource.Status.ERROR -> {
                        Logger.d(resource.exception?.exceptin?.message?:"")
                        Toasty.error(this@ScanCarActivity,resource.exception?.exceptin?.message?:"").show()

                    }
                }
            }
        })
    }
    private fun getModelAPI(descArr: ArrayList<String>,carModel: CarModel){
        progressDialog.show()
        scanViewModel.getModel(carModel.make!!).observe(this,android.arch.lifecycle.Observer { resource: Resource<BaseApiResponse>? ->
            progressDialog.dismiss()
            if(resource!=null){
                when (resource.status) {
                    Resource.Status.SUCCESS -> {
                        var families=resource.data as List<String>
                        run loop@{
                            descArr.forEach { it: String ->
                                if (families.stream().anyMatch { x -> x.equals(it.trim(), true) }) {
                                    carModel.family = it
                                    return@loop
                                }
                            }
                        }
                        if(!carModel.family.isNullOrBlank()) {
                            descArr.remove(carModel.family!!)
                        }
                        carModel.variant=descArr.toString().replace("[","").replace("]","")
                        Logger.d(Gson().toJson(carModel))
                        loadInfo(carModel)

                        getCarDetailAPI(carModel)

                    }
                    Resource.Status.ERROR -> {
                        Logger.d(resource.exception?.exceptin?.message?:"")
                        Toasty.error(this@ScanCarActivity,resource.exception?.exceptin?.message?:"").show()

                    }
                }
            }
        })
    }

    private fun getCarDetailAPI(carModel: CarModel){
//        carModel.variant=""//set empty for more result
//        carModel.year=""//set empty for more result
        progressDialog.show()
        scanViewModel.getCarDetail("",carModel.make,carModel.family,null).observe(this,android.arch.lifecycle.Observer { resource: Resource<BaseApiResponse>? ->
            progressDialog.dismiss()
            if(resource!=null){
                when (resource.status) {
                    Resource.Status.SUCCESS -> {
                        var items=resource.data as List<CarModel>
                        loadRecyler(items)
                        Logger.d(Gson().toJson(items))
                    }
                    Resource.Status.ERROR -> {
                        Logger.d(resource.exception?.exceptin?.message?:"")
                        Toasty.error(this@ScanCarActivity,resource.exception?.exceptin?.message?:"").show()

                    }
                }
            }
        })
    }

    private fun loadInfo(carModel: CarModel){
        Glide.with(this).load(carModel.fullImageURL).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
                .apply(RequestOptions()
                ).into(scanCarActivityBinding.imgCar)
        scanCarActivityBinding.txtMake.text="Make: "+(carModel.make?:"")
        scanCarActivityBinding.txtModel.text="Model: "+(carModel.family?:"")
        scanCarActivityBinding.txtVariant.text="Variant: "+(carModel.variant?:"")
        scanCarActivityBinding.txtYear.text="Year: "+(carModel.year?:"")
        scanCarActivityBinding.txtDesc.text="Description: "+(carModel.desc?:"")
        scanCarActivityBinding.viewColor.backgroundColor=Color.parseColor(carModel.color)


    }


    private fun loadRecyler(items:List<CarModel>){

        scanCarActivityBinding.recyclerView.apply {
            adapter= ScanCarAdapter(items)
            layoutManager= LinearLayoutManager(this@ScanCarActivity)

            val divider= DividerItemDecoration(context, RecyclerView.VERTICAL)
            divider.setDrawable(resources.getDrawable(R.drawable.list_divider_gray))
            addItemDecoration(divider)
        }
    }
}

