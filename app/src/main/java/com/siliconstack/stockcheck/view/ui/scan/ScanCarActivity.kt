package com.siliconstack.stockcheck.view.ui.scan

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.afollestad.materialdialogs.MaterialDialog
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.config.Config
import com.siliconstack.stockcheck.model.*
import com.siliconstack.stockcheck.view.control.CarModelGsonAdapter
import com.siliconstack.stockcheck.view.helper.DialogHelper
import com.siliconstack.stockcheck.view.ui.base.BaseActivity
import com.siliconstack.stockcheck.view.utility.Utility
import com.siliconstack.stockcheck.viewmodel.ScanViewModel
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import es.dmoral.toasty.Toasty
import javax.inject.Inject


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
            authOCRService(bitmap)
        }

    }


    private fun authOCRService(bitmap: Bitmap) {
        val ocrAuthRequest = OCRAuthRequest(Config.OCR_SYSTEM_CODE, "Android OS:"+ Build.VERSION.RELEASE+" v"+Utility.getAppVersionName(), Utility.randomString(), Config.OCR_API_KEY)
        progressDialog.show()
        scanViewModel.authenOCRService(ocrAuthRequest).observe(this, android.arch.lifecycle.Observer { resource: Resource<BaseApiResponse>? ->
            progressDialog.dismiss()
            if (resource != null) {
                when (resource.status) {
                    Resource.Status.SUCCESS -> {
                        val response = resource.data as OCRAuthenResponse
                        if (response.code != 0)
                            DialogHelper.materialDialog("Authentication with OCR service failed (${response.message}). Please try again", "Close", MaterialDialog.SingleButtonCallback { dialog, which ->
                                dialog.dismiss()
                            }, this@ScanCarActivity).show()
                        else {
                            if (!(response.data).asString.isNullOrBlank()) {
                                scanCar((response.data).asString!!, bitmap)
                            }
                        }


                    }
                    else -> {
                        if (!resource.exception?.exceptin?.message.isNullOrBlank())
                            DialogHelper.materialDialog("Authentication with OCR service failed. Please try again", "Close", MaterialDialog.SingleButtonCallback { dialog, which ->
                                dialog.dismiss()
                            }, this@ScanCarActivity).show()
                    }
                }
            } else {
                DialogHelper.materialDialog("Authentication with OCR service failed. Please try again", "Close", MaterialDialog.SingleButtonCallback { dialog, which ->
                    dialog.dismiss()
                }, this@ScanCarActivity).show()

            }
        })
    }

    private fun scanCar(token:String,bitmap: Bitmap){
        var ocrRequest=OCRRequest(Config.OCR_COUNTRY_CODE,Utility.convertBitmapToBase64(bitmap))
        progressDialog.show()
        scanViewModel.getCarDetail(token,ocrRequest).observe(this, android.arch.lifecycle.Observer { resource: Resource<BaseApiResponse>? ->
            progressDialog.dismiss()
            if (resource != null) {
                when (resource.status) {
                    Resource.Status.SUCCESS -> {
                        val baseResponse= resource.data as JsonElement

                        val carModels :List<CarModel> = Gson().fromJson(baseResponse, object : TypeToken<List<CarModel>>() {}.type)

                        loadInfo(carModels)
                    }
                    Resource.Status.ERROR -> {
                        progressDialog.dismiss()
                        Toasty.error(this@ScanCarActivity,resource.exception?.exceptin?.message?:"").show()

                    }
                }
            }
        })
    }

    private fun loadInfo(carModels: List<CarModel>){
        if(carModels.count()>0)
            scanCarActivityBinding.wormDotsIndicator.visibility= View.VISIBLE
        Glide.with(this@ScanCarActivity).load(imagePath).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
                .apply(RequestOptions()
                ).into(scanCarActivityBinding.imgCar)
        scanCarActivityBinding.viewPager.adapter=ViewPagerAdapter(carModels,imagePath?:"")
        scanCarActivityBinding.wormDotsIndicator.setViewPager(scanCarActivityBinding.viewPager)
        scanCarActivityBinding.viewPager.setPageTransformer(true,ZoomOutPageTransformer())
    }


}

