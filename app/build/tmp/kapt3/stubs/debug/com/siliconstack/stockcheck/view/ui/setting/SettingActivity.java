package com.siliconstack.stockcheck.view.ui.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020#J\b\u0010-\u001a\u00020#H\u0002J\b\u0010.\u001a\u00020#H\u0002J\b\u0010/\u001a\u00020#H\u0016J\u0012\u00100\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020#H\u0014J\u0010\u00104\u001a\u00020#2\u0006\u00105\u001a\u000206H\u0016J\u0006\u00107\u001a\u00020#J\u0006\u00108\u001a\u00020#J\u0006\u00109\u001a\u00020#J\b\u0010:\u001a\u00020#H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006;"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/setting/SettingActivity;", "Lcom/siliconstack/stockcheck/view/ui/base/BaseActivity;", "Lcom/siliconstack/stockcheck/view/ui/MainActivityListener;", "Lcom/siliconstack/stockcheck/view/ui/setting/SettingListener;", "()V", "adapter", "Lcom/siliconstack/stockcheck/view/ui/setting/SettingAdapter;", "getAdapter", "()Lcom/siliconstack/stockcheck/view/ui/setting/SettingAdapter;", "setAdapter", "(Lcom/siliconstack/stockcheck/view/ui/setting/SettingAdapter;)V", "materialDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getMaterialDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "setMaterialDialog", "(Lcom/afollestad/materialdialogs/MaterialDialog;)V", "selectedPos", "", "getSelectedPos", "()I", "setSelectedPos", "(I)V", "settingActivityBinding", "Lcom/siliconstack/stockcheck/databinding/SettingActivityBinding;", "getSettingActivityBinding", "()Lcom/siliconstack/stockcheck/databinding/SettingActivityBinding;", "setSettingActivityBinding", "(Lcom/siliconstack/stockcheck/databinding/SettingActivityBinding;)V", "spinnerArr", "Ljava/util/ArrayList;", "", "getSpinnerArr", "()Ljava/util/ArrayList;", "addFloor", "", "floorModel", "Lcom/siliconstack/stockcheck/model/FloorModel;", "addLocation", "locationModel", "Lcom/siliconstack/stockcheck/model/LocationModel;", "addOperator", "operatorModel", "Lcom/siliconstack/stockcheck/model/OperatorModel;", "createNewDialog", "init", "initViewBinding", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRemove", "settingDTO", "Lcom/siliconstack/stockcheck/model/SettingDTO;", "refreshListFloor", "refreshListLocation", "refreshListName", "setListener", "app_debug"})
public final class SettingActivity extends com.siliconstack.stockcheck.view.ui.base.BaseActivity implements com.siliconstack.stockcheck.view.ui.MainActivityListener, com.siliconstack.stockcheck.view.ui.setting.SettingListener {
    @org.jetbrains.annotations.NotNull()
    public com.siliconstack.stockcheck.databinding.SettingActivityBinding settingActivityBinding;
    @org.jetbrains.annotations.NotNull()
    public com.afollestad.materialdialogs.MaterialDialog materialDialog;
    @org.jetbrains.annotations.NotNull()
    public com.siliconstack.stockcheck.view.ui.setting.SettingAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> spinnerArr = null;
    private int selectedPos;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.databinding.SettingActivityBinding getSettingActivityBinding() {
        return null;
    }
    
    public final void setSettingActivityBinding(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.databinding.SettingActivityBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.afollestad.materialdialogs.MaterialDialog getMaterialDialog() {
        return null;
    }
    
    public final void setMaterialDialog(@org.jetbrains.annotations.NotNull()
    com.afollestad.materialdialogs.MaterialDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.view.ui.setting.SettingAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.view.ui.setting.SettingAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getSpinnerArr() {
        return null;
    }
    
    public final int getSelectedPos() {
        return 0;
    }
    
    public final void setSelectedPos(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewBinding() {
    }
    
    private final void init() {
    }
    
    public final void refreshListLocation() {
    }
    
    public final void refreshListFloor() {
    }
    
    public final void refreshListName() {
    }
    
    public final void createNewDialog() {
    }
    
    public final void addLocation(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.LocationModel locationModel) {
    }
    
    public final void addFloor(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.FloorModel floorModel) {
    }
    
    public final void addOperator(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.OperatorModel operatorModel) {
    }
    
    private final void setListener() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onRemove(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.SettingDTO settingDTO) {
    }
    
    public SettingActivity() {
        super();
    }
}