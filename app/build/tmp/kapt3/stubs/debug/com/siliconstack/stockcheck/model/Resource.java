package com.siliconstack.stockcheck.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0010\u0011B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/siliconstack/stockcheck/model/Resource;", "T", "", "status", "Lcom/siliconstack/stockcheck/model/Resource$Status;", "data", "exception", "Lcom/bol/instantapp/exception/AppException;", "(Lcom/siliconstack/stockcheck/model/Resource$Status;Ljava/lang/Object;Lcom/bol/instantapp/exception/AppException;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getException", "()Lcom/bol/instantapp/exception/AppException;", "getStatus", "()Lcom/siliconstack/stockcheck/model/Resource$Status;", "Companion", "Status", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.siliconstack.stockcheck.model.Resource.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final com.bol.instantapp.exception.AppException exception = null;
    public static final com.siliconstack.stockcheck.model.Resource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.model.Resource.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bol.instantapp.exception.AppException getException() {
        return null;
    }
    
    private Resource(com.siliconstack.stockcheck.model.Resource.Status status, T data, com.bol.instantapp.exception.AppException exception) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconstack/stockcheck/model/Resource$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "UNAUTHORIZED", "app_debug"})
    public static enum Status {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */,
        /*public static final*/ UNAUTHORIZED /* = new UNAUTHORIZED() */;
        
        Status() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\t\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/siliconstack/stockcheck/model/Resource$Companion;", "", "()V", "error", "Lcom/siliconstack/stockcheck/model/Resource;", "T", "exception", "Lcom/bol/instantapp/exception/AppException;", "success", "data", "(Ljava/lang/Object;)Lcom/siliconstack/stockcheck/model/Resource;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.siliconstack.stockcheck.model.Resource<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.siliconstack.stockcheck.model.Resource<T> error(@org.jetbrains.annotations.Nullable()
        com.bol.instantapp.exception.AppException exception) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}