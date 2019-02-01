package com.siliconstack.stockcheck.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconstack/stockcheck/config/Config;", "", "()V", "Companion", "app_debug"})
public final class Config {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CLOUD_VISION_API_KEY = "AIzaSyD6d3sgKi3TKw9nQ0nMe_5YmCAQtZsR8VU";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CLOUD_VISION_DETECT_TYPE = "DOCUMENT_TEXT_DETECTION";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CUSTOMER_TYPE = "Customer";
    private static final long MAX_CACHE_DIR_SIZE = 20000000L;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String DATE_TIME_PATTERN;
    private static int LIMIT;
    private static float MAP_ZOOM;
    private static int MAP_DEFAULT_TYPE;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String AUTHEN_KEY;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SERVER_DATE_FORMAT = "yyyy-MM-dd\'T\'HH:mm:ssZ";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COMBINE_DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UI_DATE_FORMAT = "dd/MM/yyyy";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UI_TIME_FORMAT = "h:mm a";
    private static final int REQUEST_OPEN_CAMERA_DIRECTLY = 100;
    public static final com.siliconstack.stockcheck.config.Config.Companion Companion = null;
    
    public Config() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\'\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0014\u0010)\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006\u00a8\u0006/"}, d2 = {"Lcom/siliconstack/stockcheck/config/Config$Companion;", "", "()V", "AUTHEN_KEY", "", "getAUTHEN_KEY", "()Ljava/lang/String;", "setAUTHEN_KEY", "(Ljava/lang/String;)V", "CLOUD_VISION_API_KEY", "getCLOUD_VISION_API_KEY", "CLOUD_VISION_DETECT_TYPE", "getCLOUD_VISION_DETECT_TYPE", "COMBINE_DATE_TIME_FORMAT", "getCOMBINE_DATE_TIME_FORMAT", "CUSTOMER_TYPE", "getCUSTOMER_TYPE", "DATE_TIME_PATTERN", "getDATE_TIME_PATTERN", "setDATE_TIME_PATTERN", "LIMIT", "", "getLIMIT", "()I", "setLIMIT", "(I)V", "MAP_DEFAULT_TYPE", "getMAP_DEFAULT_TYPE", "setMAP_DEFAULT_TYPE", "MAP_ZOOM", "", "getMAP_ZOOM", "()F", "setMAP_ZOOM", "(F)V", "MAX_CACHE_DIR_SIZE", "", "getMAX_CACHE_DIR_SIZE", "()J", "REQUEST_OPEN_CAMERA_DIRECTLY", "getREQUEST_OPEN_CAMERA_DIRECTLY", "SERVER_DATE_FORMAT", "getSERVER_DATE_FORMAT", "UI_DATE_FORMAT", "getUI_DATE_FORMAT", "UI_TIME_FORMAT", "getUI_TIME_FORMAT", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCLOUD_VISION_API_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCLOUD_VISION_DETECT_TYPE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCUSTOMER_TYPE() {
            return null;
        }
        
        public final long getMAX_CACHE_DIR_SIZE() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATE_TIME_PATTERN() {
            return null;
        }
        
        public final void setDATE_TIME_PATTERN(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getLIMIT() {
            return 0;
        }
        
        public final void setLIMIT(int p0) {
        }
        
        public final float getMAP_ZOOM() {
            return 0.0F;
        }
        
        public final void setMAP_ZOOM(float p0) {
        }
        
        public final int getMAP_DEFAULT_TYPE() {
            return 0;
        }
        
        public final void setMAP_DEFAULT_TYPE(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAUTHEN_KEY() {
            return null;
        }
        
        public final void setAUTHEN_KEY(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSERVER_DATE_FORMAT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOMBINE_DATE_TIME_FORMAT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUI_DATE_FORMAT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUI_TIME_FORMAT() {
            return null;
        }
        
        public final int getREQUEST_OPEN_CAMERA_DIRECTLY() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}