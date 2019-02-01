package com.siliconstack.stockcheck.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconstack/stockcheck/repository/BaseRepository;", "", "()V", "Companion", "app_debug"})
public class BaseRepository {
    public static final com.siliconstack.stockcheck.repository.BaseRepository.Companion Companion = null;
    
    public BaseRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconstack/stockcheck/repository/BaseRepository$Companion;", "", "()V", "MyRetrofitCallback", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/siliconstack/stockcheck/repository/BaseRepository$Companion$MyRetrofitCallback;", "T", "Lretrofit2/Callback;", "data", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/siliconstack/stockcheck/model/Resource;", "(Landroid/arch/lifecycle/MutableLiveData;)V", "getData", "()Landroid/arch/lifecycle/MutableLiveData;", "setData", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_debug"})
        public static class MyRetrofitCallback<T extends java.lang.Object> implements retrofit2.Callback<T> {
            @org.jetbrains.annotations.NotNull()
            private android.arch.lifecycle.MutableLiveData<com.siliconstack.stockcheck.model.Resource<T>> data;
            
            @java.lang.Override()
            public void onResponse(@org.jetbrains.annotations.NotNull()
            retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
            retrofit2.Response<T> response) {
            }
            
            @java.lang.Override()
            public void onFailure(@org.jetbrains.annotations.NotNull()
            retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
            java.lang.Throwable t) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.arch.lifecycle.MutableLiveData<com.siliconstack.stockcheck.model.Resource<T>> getData() {
                return null;
            }
            
            public final void setData(@org.jetbrains.annotations.NotNull()
            android.arch.lifecycle.MutableLiveData<com.siliconstack.stockcheck.model.Resource<T>> p0) {
            }
            
            public MyRetrofitCallback(@org.jetbrains.annotations.NotNull()
            android.arch.lifecycle.MutableLiveData<com.siliconstack.stockcheck.model.Resource<T>> data) {
                super();
            }
        }
    }
}