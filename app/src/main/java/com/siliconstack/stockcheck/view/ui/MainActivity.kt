package com.siliconstack.stockcheck.view.ui

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.adapters.ViewGroupBindingAdapter.setListener
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.afollestad.materialdialogs.MaterialDialog
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.PreferenceSetting
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.config.Config
import com.siliconstack.stockcheck.databinding.MainActivityBinding
import com.siliconstack.stockcheck.model.FloorModel
import com.siliconstack.stockcheck.model.LocationModel
import com.siliconstack.stockcheck.model.MainModel
import com.siliconstack.stockcheck.model.OperatorModel
import com.siliconstack.stockcheck.view.control.GsonGenericClass
import com.siliconstack.stockcheck.view.helper.DialogHelper
import com.siliconstack.stockcheck.view.helper.PreferenceHelper
import com.siliconstack.stockcheck.view.ui.base.BaseActivity
import com.siliconstack.stockcheck.view.ui.scan.ScanActivity
import com.siliconstack.stockcheck.view.ui.search.SearchActivity
import com.siliconstack.stockcheck.view.ui.setting.SettingActivity
import com.siliconstack.stockcheck.view.utility.Utility
import com.siliconstack.stockcheck.viewmodel.MainViewModel
import dagger.android.AndroidInjection
import es.dmoral.toasty.Toasty
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.jetbrains.anko.startActivity
import java.io.StringReader


class MainActivity : BaseActivity() {

    //    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    lateinit var mainActivityBinding: MainActivityBinding
    var doubleBackToExitPressedOnce: Boolean = false
    var countHiddenMenuClick=0



    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setTranslucentBarNoScrollView()
        initViewBinding()
        setListener()
        init()

    }

    private fun initViewBinding() {
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        AppApplication.appComponent.injectViewModel(mainViewModel)
    }


    private fun init() {
        setSupportActionBar(mainActivityBinding.toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        mainActivityBinding.txtAppVersion.text = "Stock Check v" + Utility.getAppVersionName()
        initListData()



    }


    @SuppressLint("CheckResult")
    fun initListData(){
        progressDialog.show()
        val requests= arrayListOf<Observable<List<Any>>>()
        requests.add(mainViewModel.getLocations())
        requests.add(mainViewModel.getFloors())
        requests.add(mainViewModel.getOperators())
        requests.add(mainViewModel.getStockChecks())
        Observable
                .zip(requests) { it: Array<out Any> ->
                    it
                }.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ it: Array<out Any>? ->
                    progressDialog.dismiss()
                    it?.forEachIndexed { index, any ->
                        val reader = JsonReader(StringReader(AppApplication.gson.toJson(any)))
                        reader.isLenient = true
                        when (index) {
                            0 -> {
                                if (!any.toString().isBlank()) {
                                    mainViewModel.locationDAO.deleteAll()
                                    val locations:List<LocationModel> = AppApplication.gson.fromJson(reader, GsonGenericClass<LocationModel>(LocationModel::class.java))
                                    locations.forEach {
                                        mainViewModel.locationDAO.addRow(LocationModel(it.name, it.id))
                                    }
                                }
                            }
                            1 -> {
                                if (!any.toString().isBlank()) {
                                    mainViewModel.floorDAO.deleteAll()
                                    val locations:List<FloorModel> = AppApplication.gson.fromJson(reader, GsonGenericClass<FloorModel>(FloorModel::class.java))
                                    locations.forEach {
                                        mainViewModel.floorDAO.addRow(FloorModel(it.name, it.id))
                                    }
                                }
                            }
                            2 -> {
                                if (!any.toString().isBlank()) {
                                    mainViewModel.nameDAO.deleteAll()
                                    val locations:List<OperatorModel> = AppApplication.gson.fromJson(reader, GsonGenericClass<OperatorModel>(OperatorModel::class.java))
                                    locations.forEach {
                                        mainViewModel.nameDAO.addRow(OperatorModel(it.name, it.id))
                                    }
                                }
                            }
                            3-> {
                                if (!any.toString().isBlank()) {
                                    mainViewModel.mainDAO.deleteAll()
                                    val locations:List<MainModel> = AppApplication.gson.fromJson(reader, GsonGenericClass<MainModel>(MainModel::class.java))
                                    locations.forEach {
                                        mainViewModel.mainDAO.addRow(MainModel(it.id, it.scanText,it.timestamp,it.locationID,
                                                it.floorID,it.operatorID,it.bayNumber,it.scanTextTypeId))
                                    }
                                }
                            }

                        }
                    }

                }) {
                    progressDialog.dismiss()
                    Toasty.error(this@MainActivity,it.message?:"").show()


                }
    }

    @SuppressLint("MissingPermission", "CheckResult")
    private fun setListener() {
        mainActivityBinding.btnScanVin.setOnClickListener {
            startActivity<ScanActivity>("scanEnum" to ScanActivity.SCAN_ENUM.VIN.ordinal)
        }
        mainActivityBinding.btnScanRego.setOnClickListener {
            startActivity<ScanActivity>("scanEnum" to ScanActivity.SCAN_ENUM.REGO.ordinal)
        }
        mainActivityBinding.btnScanQrcode.setOnClickListener {
            startActivity<ScanActivity>("scanEnum" to ScanActivity.SCAN_ENUM.QRCODE.ordinal)
        }

        mainActivityBinding.btnScanBarcode.setOnClickListener {
            startActivity<ScanActivity>("scanEnum" to ScanActivity.SCAN_ENUM.BARCODE.ordinal)
        }

        mainActivityBinding.btnScanDriver.setOnClickListener {
            startActivity<ScanActivity>("scanEnum" to ScanActivity.SCAN_ENUM.DRIVER.ordinal)
        }
        mainActivityBinding.btnScanCar.setOnClickListener {
            startActivity<ScanActivity>("scanEnum" to ScanActivity.SCAN_ENUM.CAR.ordinal)
        }


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.btn_view -> {
                startActivity<SearchActivity>()
                return true
            }
            R.id.btn_setting -> {
                startActivity<SettingActivity>()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finish()
        }
        doubleBackToExitPressedOnce = true
        Toasty.info(this, getString(R.string.msg_exit)).show()
        AppApplication.handler.postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }

    override fun onDestroy() {
        super.onDestroy()

    }




    override fun onPause() {
        super.onPause()
    }

    override fun onStart() {
        super.onStart()


    }



}

interface MainActivityListener {

}