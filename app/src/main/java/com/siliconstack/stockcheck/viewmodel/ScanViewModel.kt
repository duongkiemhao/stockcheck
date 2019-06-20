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

    fun getDriverLicence(token:String,ocrRequest: OCRRequest) : LiveData<Resource<BaseApiResponse>> {
        return homeRepository.getDriverLicence(token,ocrRequest)
    }
    fun getVin(token:String,ocrRequest: OCRRequest) : LiveData<Resource<BaseApiResponse>> {
        return homeRepository.getVin(token,ocrRequest)
    }
    fun getRego(token:String,ocrRequest: OCRRequest) : LiveData<Resource<BaseApiResponse>> {
        return homeRepository.getRego(token,ocrRequest)
    }
    fun getGoogleVision(key:String,googleVisionRequest: GoogleVisionRequest) : LiveData<Resource<BaseApiResponse>> {
        return homeRepository.getGoogleVision(key,googleVisionRequest)
    }

    fun getCarDetail(token:String,ocrRequest: OCRRequest) : LiveData<Resource<BaseApiResponse>> {
        return homeRepository.getCarDetail(token,ocrRequest)
    }

    fun authenOCRService(ocrAuthRequest: OCRAuthRequest) : LiveData<Resource<BaseApiResponse>> {
        return homeRepository.getOCRAuth(ocrAuthRequest)
    }

}
