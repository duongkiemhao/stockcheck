package com.siliconstack.stockcheck.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity()
data class LocationModel (

        var name:String,
        @PrimaryKey(autoGenerate = true)
        var id:Int


) {
        override fun toString(): String {
                return name
        }
}