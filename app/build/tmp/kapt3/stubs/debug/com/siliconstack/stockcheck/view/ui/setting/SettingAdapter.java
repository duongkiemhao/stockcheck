package com.siliconstack.stockcheck.view.ui.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/setting/SettingAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/siliconstack/stockcheck/view/ui/setting/SettingAdapter$ViewHolder;", "settingListener", "Lcom/siliconstack/stockcheck/view/ui/setting/SettingListener;", "(Lcom/siliconstack/stockcheck/view/ui/setting/SettingListener;)V", "items", "", "Lcom/siliconstack/stockcheck/model/SettingDTO;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getSettingListener", "()Lcom/siliconstack/stockcheck/view/ui/setting/SettingListener;", "setSettingListener", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SettingEnum", "ViewHolder", "app_debug"})
public final class SettingAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.siliconstack.stockcheck.view.ui.setting.SettingAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.siliconstack.stockcheck.model.SettingDTO> items;
    @org.jetbrains.annotations.NotNull()
    private com.siliconstack.stockcheck.view.ui.setting.SettingListener settingListener;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.SettingDTO> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.SettingDTO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.siliconstack.stockcheck.view.ui.setting.SettingAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.view.ui.setting.SettingAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.view.ui.setting.SettingListener getSettingListener() {
        return null;
    }
    
    public final void setSettingListener(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.view.ui.setting.SettingListener p0) {
    }
    
    public SettingAdapter(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.view.ui.setting.SettingListener settingListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/setting/SettingAdapter$SettingEnum;", "", "(Ljava/lang/String;I)V", "LOCATION", "FLOOR", "NAME", "app_debug"})
    public static enum SettingEnum {
        /*public static final*/ LOCATION /* = new LOCATION() */,
        /*public static final*/ FLOOR /* = new FLOOR() */,
        /*public static final*/ NAME /* = new NAME() */;
        
        SettingEnum() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/setting/SettingAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "binding", "Lcom/siliconstack/stockcheck/databinding/SettingItemBinding;", "(Lcom/siliconstack/stockcheck/databinding/SettingItemBinding;)V", "getBinding", "()Lcom/siliconstack/stockcheck/databinding/SettingItemBinding;", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.siliconstack.stockcheck.databinding.SettingItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconstack.stockcheck.databinding.SettingItemBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.siliconstack.stockcheck.databinding.SettingItemBinding binding) {
            super(null);
        }
    }
}