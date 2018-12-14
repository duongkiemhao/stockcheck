package com.siliconstack.stockcheck.viewmodel

import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.persistence.db.SimpleSQLiteQuery
import com.orhanobut.logger.Logger
import com.siliconstack.stockcheck.dao.MainDAO
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.config.Config
import com.siliconstack.stockcheck.room.AppDatabase
import javax.inject.Inject
import com.siliconstack.stockcheck.dao.FloorDAO
import com.siliconstack.stockcheck.dao.LocationDAO
import com.siliconstack.stockcheck.dao.NameDAO
import com.siliconstack.stockcheck.model.*
import com.siliconstack.stockcheck.repository.HomeRepository


class ScanViewModel @Inject constructor (application: AppApplication): AndroidViewModel(application) {

    @Inject
    lateinit var  homeRepository: HomeRepository
    lateinit var ocrModel:OCRModel



    init {


    }

    fun getDriverLicence(ocrRequest: OCRRequest) : LiveData<Resource<BaseApiResponse>> {
        return homeRepository.getDriverLicence(ocrRequest)
    }


}