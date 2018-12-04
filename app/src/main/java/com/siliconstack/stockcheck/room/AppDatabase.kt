package com.siliconstack.stockcheck.room

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.migration.Migration
import android.content.Context
import com.siliconstack.stockcheck.dao.FloorDAO
import com.siliconstack.stockcheck.dao.LocationDAO

import com.siliconstack.stockcheck.dao.MainDAO
import com.siliconstack.stockcheck.dao.NameDAO
import com.siliconstack.stockcheck.model.*

@Database(entities = arrayOf(MainModel::class,LocationModel::class,FloorModel::class,OperatorModel::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun mainDAO(): MainDAO
    abstract fun locationDAO(): LocationDAO
    abstract fun floorDAO(): FloorDAO
    abstract fun nameDAO(): NameDAO

    companion object {

        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                val MIGRATION_2_3 = object : Migration(2, 3) {
                    override fun migrate(database: SupportSQLiteDatabase) {
                        database.execSQL("ALTER TABLE MainModel ADD COLUMN lat REAL DEFAULT 0.0")
                        database.execSQL("ALTER TABLE MainModel ADD COLUMN lng REAL DEFAULT 0.0")
                        database.execSQL("ALTER TABLE MainModel ADD COLUMN image TEXT")
                    }
                }


                INSTANCE = Room.databaseBuilder(context, AppDatabase::class.java, "main")
//                        .addMigrations(MIGRATION_2_3)
                        .allowMainThreadQueries().build()
            }
            return INSTANCE as AppDatabase
        }
    }

}