package com.siliconstack.stockcheck.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ:\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cJ\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cJ\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0014J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cJ\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cJ\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010+\u001a\u00020,J\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010.\u001a\u00020/J\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u00101\u001a\u000202J\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u00104\u001a\u000205R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u00066"}, d2 = {"Lcom/siliconstack/stockcheck/repository/HomeRepository;", "Lcom/siliconstack/stockcheck/repository/BaseRepository;", "OCRApi", "Lcom/siliconstack/stockcheck/api/OCRApi;", "teleserviceApi", "Lcom/siliconstack/stockcheck/api/TeleserviceApi;", "googleVisionApi", "Lcom/siliconstack/stockcheck/api/GoogleVisionApi;", "(Lcom/siliconstack/stockcheck/api/OCRApi;Lcom/siliconstack/stockcheck/api/TeleserviceApi;Lcom/siliconstack/stockcheck/api/GoogleVisionApi;)V", "getOCRApi", "()Lcom/siliconstack/stockcheck/api/OCRApi;", "getGoogleVisionApi", "()Lcom/siliconstack/stockcheck/api/GoogleVisionApi;", "getTeleserviceApi", "()Lcom/siliconstack/stockcheck/api/TeleserviceApi;", "getCarDetail", "Landroid/arch/lifecycle/LiveData;", "Lcom/siliconstack/stockcheck/model/Resource;", "Lcom/siliconstack/stockcheck/model/BaseApiResponse;", "year", "", "make", "family", "variant", "getDriverLicence", "ocrRequest", "Lcom/siliconstack/stockcheck/model/OCRRequest;", "getFloors", "Lio/reactivex/Observable;", "", "", "getGoogleVision", "url", "googleVisionRequest", "Lcom/siliconstack/stockcheck/model/GoogleVisionRequest;", "getLocations", "getMake", "getModel", "getOperators", "getRego", "getStockChecks", "getVin", "postFloor", "floorModel", "Lcom/siliconstack/stockcheck/model/FloorModel;", "postLocation", "locationModel", "Lcom/siliconstack/stockcheck/model/LocationModel;", "postOperator", "operatorModel", "Lcom/siliconstack/stockcheck/model/OperatorModel;", "postStockChecks", "mainModel", "Lcom/siliconstack/stockcheck/model/MainModel;", "app_debug"})
public final class HomeRepository extends com.siliconstack.stockcheck.repository.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.siliconstack.stockcheck.api.OCRApi OCRApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconstack.stockcheck.api.TeleserviceApi teleserviceApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconstack.stockcheck.api.GoogleVisionApi googleVisionApi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> getDriverLicence(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.OCRRequest ocrRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> getVin(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.OCRRequest ocrRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> getRego(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.OCRRequest ocrRequest) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> postStockChecks(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.MainModel mainModel) {
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
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> getGoogleVision(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.GoogleVisionRequest googleVisionRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> getMake() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> getModel(@org.jetbrains.annotations.NotNull()
    java.lang.String make) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.siliconstack.stockcheck.model.Resource<com.siliconstack.stockcheck.model.BaseApiResponse>> getCarDetail(@org.jetbrains.annotations.Nullable()
    java.lang.String year, @org.jetbrains.annotations.Nullable()
    java.lang.String make, @org.jetbrains.annotations.Nullable()
    java.lang.String family, @org.jetbrains.annotations.Nullable()
    java.lang.String variant) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.api.OCRApi getOCRApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.api.TeleserviceApi getTeleserviceApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.api.GoogleVisionApi getGoogleVisionApi() {
        return null;
    }
    
    public HomeRepository(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.api.OCRApi OCRApi, @org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.api.TeleserviceApi teleserviceApi, @org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.api.GoogleVisionApi googleVisionApi) {
        super();
    }
}