package com.siliconstack.stockcheck.dao

import android.arch.persistence.db.SupportSQLiteQuery
import android.arch.persistence.room.*


import android.arch.persistence.room.OnConflictStrategy.REPLACE
import com.siliconstack.stockcheck.model.MainDTO
import com.siliconstack.stockcheck.model.MainModel

@Dao
interface MainDAO {

    @RawQuery
    fun query(query:SupportSQLiteQuery): List<MainDTO>

    @Insert(onConflict = REPLACE)
    fun addRow(mainModel: MainModel)

    @Delete
    fun deleteRow(mainModel: MainModel)

    @Update
    fun updateRow(mainModel: MainModel)


    @Query("delete from MainModel where id =:id")
    fun deleteById(id: Int)

    @Query("delete from MainModel where id IN(:ids)")
    fun deleteByIds(ids: IntArray)


}