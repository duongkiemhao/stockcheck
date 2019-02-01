package com.siliconstack.stockcheck.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/siliconstack/stockcheck/di/ActivityModule;", "", "()V", "contributeBaseActivity", "Lcom/siliconstack/stockcheck/view/ui/base/BaseActivity;", "injectLoginActivity", "Lcom/siliconstack/stockcheck/view/ui/MainActivity;", "injectScanCarActivity", "Lcom/siliconstack/stockcheck/view/ui/scan/ScanCarActivity;", "injectScanResultActivity", "Lcom/siliconstack/stockcheck/view/ui/scan/ScanActivity;", "injectSearchActivity", "Lcom/siliconstack/stockcheck/view/ui/search/SearchActivity;", "injectSettingActivity", "Lcom/siliconstack/stockcheck/view/ui/setting/SettingActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconstack.stockcheck.di.EmptyFragmentBuildersModule.class})
    public abstract com.siliconstack.stockcheck.view.ui.base.BaseActivity contributeBaseActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconstack.stockcheck.di.EmptyFragmentBuildersModule.class})
    public abstract com.siliconstack.stockcheck.view.ui.MainActivity injectLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconstack.stockcheck.di.SearchFragmentBuildersModule.class})
    public abstract com.siliconstack.stockcheck.view.ui.search.SearchActivity injectSearchActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconstack.stockcheck.di.EmptyFragmentBuildersModule.class})
    public abstract com.siliconstack.stockcheck.view.ui.setting.SettingActivity injectSettingActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconstack.stockcheck.di.ScanFragmentBuildersModule.class})
    public abstract com.siliconstack.stockcheck.view.ui.scan.ScanActivity injectScanResultActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconstack.stockcheck.di.ScanFragmentBuildersModule.class})
    public abstract com.siliconstack.stockcheck.view.ui.scan.ScanCarActivity injectScanCarActivity();
    
    public ActivityModule() {
        super();
    }
}