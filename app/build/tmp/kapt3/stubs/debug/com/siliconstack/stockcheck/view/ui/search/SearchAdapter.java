package com.siliconstack.stockcheck.view.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ0\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J(\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0017J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter;", "Lcom/thoughtbot/expandablerecyclerview/ExpandableRecyclerViewAdapter;", "Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter$MyGroupViewHolder;", "Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter$MyChildViewHolder;", "searchListener", "Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragmentListener;", "groups", "", "Lcom/thoughtbot/expandablerecyclerview/models/ExpandableGroup;", "(Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragmentListener;Ljava/util/List;)V", "getSearchListener", "()Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragmentListener;", "expandGroup", "", "onBindChildViewHolder", "viewHolder", "flatPosition", "", "group", "childIndex", "onBindGroupViewHolder", "holder", "onCreateChildViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onCreateGroupViewHolder", "MyChildViewHolder", "MyGroupViewHolder", "app_debug"})
public final class SearchAdapter extends com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter<com.siliconstack.stockcheck.view.ui.search.SearchAdapter.MyGroupViewHolder, com.siliconstack.stockcheck.view.ui.search.SearchAdapter.MyChildViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.siliconstack.stockcheck.view.ui.search.ListViewFragmentListener searchListener = null;
    
    @java.lang.Override()
    public void onBindChildViewHolder(@org.jetbrains.annotations.Nullable()
    com.siliconstack.stockcheck.view.ui.search.SearchAdapter.MyChildViewHolder viewHolder, int flatPosition, @org.jetbrains.annotations.Nullable()
    com.thoughtbot.expandablerecyclerview.models.ExpandableGroup<?> group, int childIndex) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindGroupViewHolder(@org.jetbrains.annotations.Nullable()
    com.siliconstack.stockcheck.view.ui.search.SearchAdapter.MyGroupViewHolder holder, int flatPosition, @org.jetbrains.annotations.Nullable()
    com.thoughtbot.expandablerecyclerview.models.ExpandableGroup<?> group) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.siliconstack.stockcheck.view.ui.search.SearchAdapter.MyGroupViewHolder onCreateGroupViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.siliconstack.stockcheck.view.ui.search.SearchAdapter.MyChildViewHolder onCreateChildViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void expandGroup() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.view.ui.search.ListViewFragmentListener getSearchListener() {
        return null;
    }
    
    public SearchAdapter(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.view.ui.search.ListViewFragmentListener searchListener, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.thoughtbot.expandablerecyclerview.models.ExpandableGroup<?>> groups) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter$MyChildViewHolder;", "Lcom/thoughtbot/expandablerecyclerview/viewholders/ChildViewHolder;", "binding", "Lcom/siliconstack/stockcheck/databinding/SearchItemBinding;", "(Lcom/siliconstack/stockcheck/databinding/SearchItemBinding;)V", "getBinding", "()Lcom/siliconstack/stockcheck/databinding/SearchItemBinding;", "app_debug"})
    public static final class MyChildViewHolder extends com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.siliconstack.stockcheck.databinding.SearchItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconstack.stockcheck.databinding.SearchItemBinding getBinding() {
            return null;
        }
        
        public MyChildViewHolder(@org.jetbrains.annotations.NotNull()
        com.siliconstack.stockcheck.databinding.SearchItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/search/SearchAdapter$MyGroupViewHolder;", "Lcom/thoughtbot/expandablerecyclerview/viewholders/GroupViewHolder;", "binding", "Lcom/siliconstack/stockcheck/databinding/SearchHeaderItemBinding;", "(Lcom/siliconstack/stockcheck/databinding/SearchHeaderItemBinding;)V", "getBinding", "()Lcom/siliconstack/stockcheck/databinding/SearchHeaderItemBinding;", "app_debug"})
    public static final class MyGroupViewHolder extends com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.siliconstack.stockcheck.databinding.SearchHeaderItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconstack.stockcheck.databinding.SearchHeaderItemBinding getBinding() {
            return null;
        }
        
        public MyGroupViewHolder(@org.jetbrains.annotations.NotNull()
        com.siliconstack.stockcheck.databinding.SearchHeaderItemBinding binding) {
            super(null);
        }
    }
}