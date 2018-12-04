package com.siliconstack.stockcheck.di

import com.siliconstack.stockcheck.view.ui.*
import com.siliconstack.stockcheck.view.ui.base.BaseActivity
import com.siliconstack.stockcheck.view.ui.scan.ScanResultActivity
import com.siliconstack.stockcheck.view.ui.search.SearchActivity
import com.siliconstack.stockcheck.view.ui.setting.SettingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [EmptyFragmentBuildersModule::class])
    abstract fun contributeBaseActivity(): BaseActivity


    @ContributesAndroidInjector(modules = [EmptyFragmentBuildersModule::class])
    abstract fun injectLoginActivity(): MainActivity
    @ContributesAndroidInjector(modules = [SearchFragmentBuildersModule::class])
    abstract fun injectSearchActivity(): SearchActivity
    @ContributesAndroidInjector(modules = [EmptyFragmentBuildersModule::class])
    abstract fun injectSettingActivity(): SettingActivity
    @ContributesAndroidInjector(modules = [EmptyFragmentBuildersModule::class])
    abstract fun injectScanResultActivity(): ScanResultActivity
}