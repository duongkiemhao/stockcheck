package com.siliconstack.stockcheck.view.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006 "}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/search/SearchActivity;", "Lcom/siliconstack/stockcheck/view/ui/base/BaseActivity;", "Lcom/siliconstack/stockcheck/view/ui/search/SearchListener;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/support/v4/app/Fragment;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "isListView", "", "()Z", "setListView", "(Z)V", "searchActivityBinding", "Lcom/siliconstack/stockcheck/databinding/SearchActivityBinding;", "getSearchActivityBinding", "()Lcom/siliconstack/stockcheck/databinding/SearchActivityBinding;", "setSearchActivityBinding", "(Lcom/siliconstack/stockcheck/databinding/SearchActivityBinding;)V", "init", "", "initViewBinding", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "supportFragmentInjector", "app_debug"})
public final class SearchActivity extends com.siliconstack.stockcheck.view.ui.base.BaseActivity implements com.siliconstack.stockcheck.view.ui.search.SearchListener, dagger.android.support.HasSupportFragmentInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> dispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    public com.siliconstack.stockcheck.databinding.SearchActivityBinding searchActivityBinding;
    private boolean isListView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.databinding.SearchActivityBinding getSearchActivityBinding() {
        return null;
    }
    
    public final void setSearchActivityBinding(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.databinding.SearchActivityBinding p0) {
    }
    
    public final boolean isListView() {
        return false;
    }
    
    public final void setListView(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewBinding() {
    }
    
    public final void setListener() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void init() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    public SearchActivity() {
        super();
    }
}