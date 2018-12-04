package com.siliconstack.stockcheck.view.ui

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.databinding.MainActivityBinding
import com.siliconstack.stockcheck.view.ui.base.BaseActivity
import com.siliconstack.stockcheck.view.ui.scan.ScanResultActivity
import com.siliconstack.stockcheck.view.ui.search.SearchActivity
import com.siliconstack.stockcheck.view.ui.setting.SettingActivity
import com.siliconstack.stockcheck.view.utility.Utility
import com.siliconstack.stockcheck.viewmodel.MainViewModel
import dagger.android.AndroidInjection
import es.dmoral.toasty.Toasty
import org.jetbrains.anko.startActivity


class MainActivity : BaseActivity() {

    //    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    lateinit var mainActivityBinding: MainActivityBinding
    var doubleBackToExitPressedOnce: Boolean = false



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


    @SuppressLint("MissingPermission")
    private fun init() {
        setSupportActionBar(mainActivityBinding.toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        mainActivityBinding.txtAppVersion.text = "Stock Check v" + Utility.getAppVersionName()



    }


    @SuppressLint("MissingPermission", "CheckResult")
    private fun setListener() {
        mainActivityBinding.btnScanVin.setOnClickListener {
            startActivity<ScanResultActivity>("scanEnum" to ScanResultActivity.SCAN_ENUM.VIN.ordinal)
        }
        mainActivityBinding.btnScanRego.setOnClickListener {
            startActivity<ScanResultActivity>("scanEnum" to ScanResultActivity.SCAN_ENUM.REGO.ordinal)
        }
        mainActivityBinding.btnScanQrcode.setOnClickListener {
            startActivity<ScanResultActivity>("scanEnum" to ScanResultActivity.SCAN_ENUM.QRCODE.ordinal)
        }

        mainActivityBinding.btnScanBarcode.setOnClickListener {
            startActivity<ScanResultActivity>("scanEnum" to ScanResultActivity.SCAN_ENUM.BARCODE.ordinal)
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