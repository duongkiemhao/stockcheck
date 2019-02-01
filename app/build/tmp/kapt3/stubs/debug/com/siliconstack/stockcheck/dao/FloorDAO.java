package com.siliconstack.stockcheck.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/siliconstack/stockcheck/dao/FloorDAO;", "", "addRow", "", "floorModel", "Lcom/siliconstack/stockcheck/model/FloorModel;", "deleteAll", "deleteById", "id", "", "deleteRow", "getAll", "", "updateRow", "app_debug"})
public abstract interface FloorDAO {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "select * from FloorModel")
    public abstract java.util.List<com.siliconstack.stockcheck.model.FloorModel> getAll();
    
    @android.arch.persistence.room.Query(value = "delete from FloorModel")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void addRow(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.FloorModel floorModel);
    
    @android.arch.persistence.room.Delete()
    public abstract void deleteRow(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.FloorModel floorModel);
    
    @android.arch.persistence.room.Update()
    public abstract void updateRow(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.FloorModel floorModel);
    
    @android.arch.persistence.room.Query(value = "delete from FloorModel where id =:id")
    public abstract void deleteById(int id);
}