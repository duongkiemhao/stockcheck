package com.siliconstack.stockcheck.room;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {com.siliconstack.stockcheck.model.MainModel.class, com.siliconstack.stockcheck.model.LocationModel.class, com.siliconstack.stockcheck.model.FloorModel.class, com.siliconstack.stockcheck.model.OperatorModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/siliconstack/stockcheck/room/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "floorDAO", "Lcom/siliconstack/stockcheck/dao/FloorDAO;", "locationDAO", "Lcom/siliconstack/stockcheck/dao/LocationDAO;", "mainDAO", "Lcom/siliconstack/stockcheck/dao/MainDAO;", "nameDAO", "Lcom/siliconstack/stockcheck/dao/NameDAO;", "Companion", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    private static com.siliconstack.stockcheck.room.AppDatabase INSTANCE;
    public static final com.siliconstack.stockcheck.room.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.siliconstack.stockcheck.dao.MainDAO mainDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.siliconstack.stockcheck.dao.LocationDAO locationDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.siliconstack.stockcheck.dao.FloorDAO floorDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.siliconstack.stockcheck.dao.NameDAO nameDAO();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/siliconstack/stockcheck/room/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/siliconstack/stockcheck/room/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconstack.stockcheck.room.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}