package com.siliconstack.stockcheck.di;

import java.lang.System;

/**
 * * Created by Antoni Castejón on 03/01/2018.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/siliconstack/stockcheck/di/AppComponent;", "", "inject", "", "appApplication", "Lcom/siliconstack/stockcheck/AppApplication;", "injectViewModel", "viewModel", "Landroid/arch/lifecycle/ViewModel;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.siliconstack.stockcheck.di.ActivityModule.class, com.siliconstack.stockcheck.di.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.AppApplication appApplication);
    
    public abstract void injectViewModel(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModel viewModel);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconstack/stockcheck/di/AppComponent$Builder;", "", "application", "Lcom/siliconstack/stockcheck/AppApplication;", "build", "Lcom/siliconstack/stockcheck/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.siliconstack.stockcheck.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.siliconstack.stockcheck.AppApplication application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.siliconstack.stockcheck.di.AppComponent build();
    }
}