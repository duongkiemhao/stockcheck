package com.siliconstack.stockcheck.dao

import android.arch.persistence.room.*


import android.arch.persistence.room.OnConflictStrategy.REPLACE
import com.siliconstack.stockcheck.model.LocationModel

@Dao
interface LocationDAO {

    @Query("select * from LocationModel")
    fun getAll(): List<LocationModel>

    @Insert(onConflict = REPLACE)
    fun addRow(locationModel: LocationModel)

    @Delete
    fun deleteRow(locationModel: LocationModel)

    @Query("delete from LocationModel where id =:id")
    fun deleteById(id: Int)

    @Update
    fun updateRow(locationModel: LocationModel)



}