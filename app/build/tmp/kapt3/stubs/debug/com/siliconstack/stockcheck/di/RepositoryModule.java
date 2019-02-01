package com.siliconstack.stockcheck.di;

import java.lang.System;

/**
 * * Created by bsobat on 26/05/17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/siliconstack/stockcheck/di/RepositoryModule;", "", "()V", "provideAppRepository", "Lcom/siliconstack/stockcheck/repository/HomeRepository;", "OCRApi", "Lcom/siliconstack/stockcheck/api/OCRApi;", "teleserviceApi", "Lcom/siliconstack/stockcheck/api/TeleserviceApi;", "googleVisionApi", "Lcom/siliconstack/stockcheck/api/GoogleVisionApi;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconstack.stockcheck.repository.HomeRepository provideAppRepository(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.api.OCRApi OCRApi, @org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.api.TeleserviceApi teleserviceApi, @org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.api.GoogleVisionApi googleVisionApi) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}