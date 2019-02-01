package com.siliconstack.stockcheck.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/siliconstack/stockcheck/di/ViewModelModule;", "", "()V", "bindMainViewModel", "Landroid/arch/lifecycle/ViewModel;", "mainViewModel", "Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;", "bindScanViewModel", "scanViewModel", "Lcom/siliconstack/stockcheck/viewmodel/ScanViewModel;", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/siliconstack/stockcheck/viewmodel/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.siliconstack.stockcheck.viewmodel.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.viewmodel.MainViewModel mainViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.siliconstack.stockcheck.viewmodel.ScanViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindScanViewModel(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.viewmodel.ScanViewModel scanViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.viewmodel.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}