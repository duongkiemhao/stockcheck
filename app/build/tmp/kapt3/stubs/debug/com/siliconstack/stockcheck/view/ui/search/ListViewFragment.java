package com.siliconstack.stockcheck.view.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u00108\u001a\u000209J\u0016\u0010:\u001a\u0002092\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0016J\u0010\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020=H\u0016J\u0006\u0010@\u001a\u000209J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0<J\b\u0010C\u001a\u000209H\u0002J&\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0010\u0010L\u001a\u0002092\u0006\u0010?\u001a\u00020=H\u0016J\u001a\u0010M\u001a\u0002092\u0006\u0010N\u001a\u00020E2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u000e\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020QJ;\u0010R\u001a\u0002092\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020=2\b\u0010V\u001a\u0004\u0018\u00010W2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020W0YH\u0002\u00a2\u0006\u0002\u0010ZJ\u000e\u0010[\u001a\u0002092\u0006\u0010P\u001a\u00020QJ\b\u0010\\\u001a\u000209H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107\u00a8\u0006^"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/siliconstack/stockcheck/di/Injectable;", "Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragmentListener;", "()V", "adapter", "Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter;", "getAdapter", "()Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter;", "setAdapter", "(Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter;)V", "isDateSorting", "", "()Z", "setDateSorting", "(Z)V", "isDesc", "setDesc", "isLoading", "setLoading", "listviewFragmentBinding", "Lcom/siliconstack/stockcheck/databinding/ListviewFragmentBinding;", "getListviewFragmentBinding", "()Lcom/siliconstack/stockcheck/databinding/ListviewFragmentBinding;", "setListviewFragmentBinding", "(Lcom/siliconstack/stockcheck/databinding/ListviewFragmentBinding;)V", "mScrollListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "getMScrollListener", "()Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "setMScrollListener", "(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V", "mainViewModel", "Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;", "setMainViewModel", "(Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;)V", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "getRxPermissions", "()Lcom/tbruyelle/rxpermissions2/RxPermissions;", "rxPermissions$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "bindAdapter", "", "deleteGroup", "items", "", "Lcom/siliconstack/stockcheck/model/MainDTO;", "deleteItem", "mainDTO", "export", "getListExpandGroup", "Lcom/siliconstack/stockcheck/model/SearchDTO;", "init", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "onViewCreated", "view", "openFile", "file", "Ljava/io/File;", "processCompareTimeInList", "key", "", "it", "value", "", "hashMap", "Ljava/util/HashMap;", "(Ljava/lang/String;Lcom/siliconstack/stockcheck/model/MainDTO;Ljava/lang/Long;Ljava/util/HashMap;)V", "sendMail", "setListener", "Companion", "app_debug"})
public final class ListViewFragment extends android.support.v4.app.Fragment implements com.siliconstack.stockcheck.di.Injectable, com.siliconstack.stockcheck.view.ui.search.ListViewFragmentListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.siliconstack.stockcheck.databinding.ListviewFragmentBinding listviewFragmentBinding;
    @org.jetbrains.annotations.NotNull()
    public com.siliconstack.stockcheck.viewmodel.MainViewModel mainViewModel;
    @org.jetbrains.annotations.NotNull()
    public com.siliconstack.stockcheck.view.ui.search.SearchAdapter adapter;
    private boolean isDesc;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy rxPermissions$delegate = null;
    private int offset;
    private boolean isLoading;
    private boolean isDateSorting;
    @org.jetbrains.annotations.NotNull()
    private android.support.v7.widget.RecyclerView.OnScrollListener mScrollListener;
    public static final com.siliconstack.stockcheck.view.ui.search.ListViewFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.databinding.ListviewFragmentBinding getListviewFragmentBinding() {
        return null;
    }
    
    public final void setListviewFragmentBinding(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.databinding.ListviewFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.viewmodel.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.view.ui.search.SearchAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.view.ui.search.SearchAdapter p0) {
    }
    
    public final boolean isDesc() {
        return false;
    }
    
    public final void setDesc(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tbruyelle.rxpermissions2.RxPermissions getRxPermissions() {
        return null;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public final void setOffset(int p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final boolean isDateSorting() {
        return false;
    }
    
    public final void setDateSorting(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setListener() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView.OnScrollListener getMScrollListener() {
        return null;
    }
    
    public final void setMScrollListener(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.OnScrollListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.SearchDTO> getListExpandGroup() {
        return null;
    }
    
    private final void processCompareTimeInList(java.lang.String key, com.siliconstack.stockcheck.model.MainDTO it, java.lang.Long value, java.util.HashMap<java.lang.String, java.lang.Long> hashMap) {
    }
    
    public final void export() {
    }
    
    public final void sendMail(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    public final void openFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    @java.lang.Override()
    public void deleteItem(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.MainDTO mainDTO) {
    }
    
    @java.lang.Override()
    public void deleteGroup(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconstack.stockcheck.model.MainDTO> items) {
    }
    
    public final void bindAdapter() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.MainDTO mainDTO) {
    }
    
    public ListViewFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragment$Companion;", "", "()V", "newInstance", "Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconstack.stockcheck.view.ui.search.ListViewFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}