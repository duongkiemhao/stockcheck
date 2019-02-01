package com.siliconstack.stockcheck;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0006\u0010\u0010\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\rH\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/siliconstack/stockcheck/AppApplication;", "Landroid/support/multidex/MultiDexApplication;", "Ldagger/android/HasActivityInjector;", "()V", "activityInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "Ldagger/android/AndroidInjector;", "attachBaseContext", "", "base", "Landroid/content/Context;", "initUserSetting", "onCreate", "Companion", "app_debug"})
public final class AppApplication extends android.support.multidex.MultiDexApplication implements dagger.android.HasActivityInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector;
    @org.jetbrains.annotations.NotNull()
    public static com.siliconstack.stockcheck.di.AppComponent appComponent;
    @org.jetbrains.annotations.NotNull()
    private static com.siliconstack.stockcheck.AppApplication instance;
    @org.jetbrains.annotations.NotNull()
    private static com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull()
    private static android.os.Handler handler;
    private static boolean isComeFromSC;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String imageId;
    private static final org.joda.time.DateTimeComparator dateComparator = null;
    public static final com.siliconstack.stockcheck.AppApplication.Companion Companion = null;
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityInjector() {
        return null;
    }
    
    public final void setActivityInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void initUserSetting() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    public AppApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.siliconstack.stockcheck.di.AppComponent getAppComponent() {
        return null;
    }
    
    public static final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.di.AppComponent p0) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,\u00a8\u0006-"}, d2 = {"Lcom/siliconstack/stockcheck/AppApplication$Companion;", "", "()V", "appComponent", "Lcom/siliconstack/stockcheck/di/AppComponent;", "appComponent$annotations", "getAppComponent", "()Lcom/siliconstack/stockcheck/di/AppComponent;", "setAppComponent", "(Lcom/siliconstack/stockcheck/di/AppComponent;)V", "dateComparator", "Lorg/joda/time/DateTimeComparator;", "kotlin.jvm.PlatformType", "getDateComparator", "()Lorg/joda/time/DateTimeComparator;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "imageId", "", "getImageId", "()Ljava/lang/String;", "setImageId", "(Ljava/lang/String;)V", "<set-?>", "Lcom/siliconstack/stockcheck/AppApplication;", "instance", "getInstance", "()Lcom/siliconstack/stockcheck/AppApplication;", "setInstance", "(Lcom/siliconstack/stockcheck/AppApplication;)V", "isComeFromSC", "", "()Z", "setComeFromSC", "(Z)V", "app_debug"})
    public static final class Companion {
        
        public static void appComponent$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconstack.stockcheck.di.AppComponent getAppComponent() {
            return null;
        }
        
        public final void setAppComponent(@org.jetbrains.annotations.NotNull()
        com.siliconstack.stockcheck.di.AppComponent p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconstack.stockcheck.AppApplication getInstance() {
            return null;
        }
        
        private final void setInstance(com.siliconstack.stockcheck.AppApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.gson.Gson getGson() {
            return null;
        }
        
        public final void setGson(@org.jetbrains.annotations.NotNull()
        com.google.gson.Gson p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Handler getHandler() {
            return null;
        }
        
        public final void setHandler(@org.jetbrains.annotations.NotNull()
        android.os.Handler p0) {
        }
        
        public final boolean isComeFromSC() {
            return false;
        }
        
        public final void setComeFromSC(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageId() {
            return null;
        }
        
        public final void setImageId(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final org.joda.time.DateTimeComparator getDateComparator() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}