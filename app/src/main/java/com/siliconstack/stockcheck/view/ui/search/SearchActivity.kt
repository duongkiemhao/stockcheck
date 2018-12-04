package com.siliconstack.stockcheck.view.ui.search

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.databinding.SearchActivityBinding
import com.siliconstack.stockcheck.view.ui.base.BaseActivity
import com.siliconstack.stockcheck.viewmodel.MainViewModel
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject


class SearchActivity : BaseActivity(), SearchListener, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    lateinit var searchActivityBinding: SearchActivityBinding
    var isListView=true

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        initViewBinding()
        init()
        setListener()
    }

    private fun initViewBinding() {
        searchActivityBinding = DataBindingUtil.setContentView(this, R.layout.search_activity)
        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        AppApplication.appComponent.injectViewModel(mainViewModel)
    }

    fun setListener(){
        searchActivityBinding.btnBack.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }

    fun init(){
        setTranslucentBarNoScrollView()
        supportFragmentManager.beginTransaction().replace(R.id.content,ListViewFragment.newInstance()).commit()
    }

    override fun supportFragmentInjector() = dispatchingAndroidInjector


}

interface SearchListener {

}
