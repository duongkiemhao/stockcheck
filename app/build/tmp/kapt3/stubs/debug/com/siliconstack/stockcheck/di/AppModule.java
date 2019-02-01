package com.siliconstack.stockcheck.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconstack/stockcheck/di/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "provideGSon", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module(includes = {com.siliconstack.stockcheck.di.NetModule.class, com.siliconstack.stockcheck.di.DatabaseModule.class, com.siliconstack.stockcheck.di.RepositoryModule.class, com.siliconstack.stockcheck.di.ViewModelModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGSon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideContext() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}