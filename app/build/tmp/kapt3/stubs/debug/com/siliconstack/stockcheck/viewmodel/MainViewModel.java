package com.siliconstack.stockcheck.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u0013052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0019J\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=050<J\u0012\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=050<J\u0012\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=050<J\u0012\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=050<J\u0006\u0010A\u001a\u000201J\u0010\u0010B\u001a\u0004\u0018\u00010\u00132\u0006\u0010C\u001a\u00020\u0019J\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0E2\u0006\u0010H\u001a\u00020IJ\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0E2\u0006\u0010K\u001a\u00020LJ\u001a\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0E2\u0006\u0010N\u001a\u00020OJ\u001a\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0E2\u0006\u00102\u001a\u000203R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006Q"}, d2 = {"Lcom/siliconstack/stockcheck/viewmodel/MainViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Lcom/siliconstack/stockcheck/AppApplication;", "(Lcom/siliconstack/stockcheck/AppApplication;)V", "floorDAO", "Lcom/siliconstack/stockcheck/dao/FloorDAO;", "getFloorDAO", "()Lcom/siliconstack/stockcheck/dao/FloorDAO;", "setFloorDAO", "(Lcom/siliconstack/stockcheck/dao/FloorDAO;)V", "homeRepository", "Lcom/siliconstack/stockcheck/repository/HomeRepository;", "getHomeRepository", "()Lcom/siliconstack/stockcheck/repository/HomeRepository;", "setHomeRepository", "(Lcom/siliconstack/stockcheck/repository/HomeRepository;)V", "items", "Ljava/util/ArrayList;", "Lcom/siliconstack/stockcheck/model/MainDTO;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "keyword", "", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "locationDAO", "Lcom/siliconstack/stockcheck/dao/LocationDAO;", "getLocationDAO", "()Lcom/siliconstack/stockcheck/dao/LocationDAO;", "setLocationDAO", "(Lcom/siliconstack/stockcheck/dao/LocationDAO;)V", "mainDAO", "Lcom/siliconstack/stockcheck/dao/MainDAO;", "getMainDAO", "()Lcom/siliconstack/stockcheck/dao/MainDAO;", "setMainDAO", "(Lcom/siliconstack/stockcheck/dao/MainDAO;)V", "nameDAO", "Lcom/siliconstack/stockcheck/dao/NameDAO;", "getNameDAO", "()Lcom/siliconstack/stockcheck/dao/NameDAO;", "setNameDAO", "(Lcom/siliconstack/stockcheck/dao/NameDAO;)V", "addMainModel", "", "mainModel", "Lcom/siliconstack/stockcheck/model/MainModel;", "filterListSearch", "", "isDesc", "", "offset", "", "orderBy", "getFloors", "Lio/reactivex/Observable;", "", "getLocations", "getOperators", "getStockChecks", "initItems", "isScanTextExist", "scanText", "postFloor", "Landroid/arch/lifecycle/LiveData;", "Lcom/siliconstack/stockcheck/model/Resource;", "Lcom/siliconstack/stockcheck/model/BaseApiResponse;", "floorModel", "Lcom/siliconstack/stockcheck/model/FloorModel;", "postLocation", "locationModel", "Lcom/siliconstack/stockcheck/model/LocationModel;", "postOperator", "operatorModel", "Lcom/siliconstack/stockcheck/model/OperatorModel;", "postStockCheck", "app_debug"})
public final class MainViewModel extends android.arch.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconstack.stockcheck.repository.HomeRepository homeRepository;
    @org.jetbrains.annotations.NotNull()
    private com.siliconstack.stockcheck.dao.MainDAO mainDAO;
    @org.jetbrains.annotations.NotNull()
    private com.siliconstack.stockcheck.dao.LocationDAO locationDAO;
    @org.jetbrains.annotations.NotNull()
    private com.siliconstack.stockcheck.dao.FloorDAO floorDAO;
    @org.jetbrains.annotations.NotNull()
    private com.siliconstack.stockcheck.dao.NameDAO nameDAO;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.siliconstack.stockcheck.model.MainDTO> items;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyword;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.repository.HomeRepository getHomeRepository() {
        return null;
    }
    
    public final void setHomeRepository(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.repository.HomeRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.dao.MainDAO getMainDAO() {
        return null;
    }
    
    public final void setMainDAO(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.dao.MainDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.dao.LocationDAO getLocationDAO() {
        return null;
    }
    
    public final void setLocationDAO(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.dao.LocationDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.dao.FloorDAO getFloorDAO() {
        return null;
    }
    
    public final void setFloorDAO(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.dao.FloorDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.dao.NameDAO getNameDAO() {
        return null;
    }
    
    public final void setNameDAO(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.dao.NameDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.siliconstack.stockcheck.model.MainDTO> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.siliconstack.stockcheck.model.MainDTO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyword() {
        return null;
    }
    
    public final void setKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void initItems() {
    }
    
    public final void addMainModel(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.MainModel mainModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.MainDTO> filterListSearch(boolean isDesc, int offset, @org.jetbrains.annotations.NotNull()
    java.lang.String orderBy) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconstack.stockcheck.model.MainDTO isScanTextExist(@org.jetbrains.annotations.NotNull()
    java.lang.String scanText) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> postFloor(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.FloorModel floorModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> postLocation(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.LocationModel locationModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> postOperator(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.OperatorModel operatorModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> postStockCheck(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.MainModel mainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<java.lang.Object>> getLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<java.lang.Object>> getFloors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<java.lang.Object>> getOperators() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<java.lang.Object>> getStockChecks() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.AppApplication application) {
        super(null);
    }
}