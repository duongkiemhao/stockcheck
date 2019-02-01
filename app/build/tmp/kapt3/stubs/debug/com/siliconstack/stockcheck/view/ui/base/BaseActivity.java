package com.siliconstack.stockcheck.view.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/base/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "mainViewModel", "Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;", "setMainViewModel", "(Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;)V", "progressDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getProgressDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "setProgressDialog", "(Lcom/afollestad/materialdialogs/MaterialDialog;)V", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setTranslucentBarNoScrollView", "setTranslucentToolbar", "app_debug"})
public class BaseActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.siliconstack.stockcheck.viewmodel.MainViewModel mainViewModel;
    @org.jetbrains.annotations.NotNull()
    public com.afollestad.materialdialogs.MaterialDialog progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.viewmodel.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.afollestad.materialdialogs.MaterialDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.NotNull()
    com.afollestad.materialdialogs.MaterialDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void setTranslucentToolbar() {
    }
    
    public void setTranslucentBarNoScrollView() {
    }
    
    public BaseActivity() {
        super();
    }
}