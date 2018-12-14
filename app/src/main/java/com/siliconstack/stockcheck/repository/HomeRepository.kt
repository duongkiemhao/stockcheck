package com.siliconstack.stockcheck.repository


import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import com.siliconstack.stockcheck.api.OCRApi
import com.siliconstack.stockcheck.api.TeleserviceApi
import com.siliconstack.stockcheck.config.Config
import com.siliconstack.stockcheck.model.*
import io.reactivex.Observable
import retrofit2.Call


class HomeRepository (val OCRApi: OCRApi,val teleserviceApi: TeleserviceApi) : BaseRepository() {


    fun getDriverLicence(ocrRequest: OCRRequest): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<OCRModel>>()
        OCRApi.getDriverLicence(ocrRequest).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<OCRModel>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }


    fun getLocations(): Observable<List<Any>> {
       return teleserviceApi.getLocations(Config.AUTHEN_KEY)
    }

    fun getFloors(): Observable<List<Any>> {
        return teleserviceApi.getFloors(Config.AUTHEN_KEY)
    }
    fun getOperators(): Observable<List<Any>> {
        return teleserviceApi.getOperators(Config.AUTHEN_KEY)
    }
    fun getStockChecks(): Observable<List<Any>> {
        return teleserviceApi.getStockChecks(Config.AUTHEN_KEY)
    }

    fun postStockChecks(mainModel: MainModel): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<List<MainModel>>>()
        teleserviceApi.postStockCheck(Config.AUTHEN_KEY,mainModel).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<List<MainModel>>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }

    fun postFloor(floorModel: FloorModel): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<List<FloorModel>>>()
        teleserviceApi.postFloor(Config.AUTHEN_KEY,floorModel).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<List<FloorModel>>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }

    fun postLocation(locationModel: LocationModel): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<List<LocationModel>>>()
        teleserviceApi.postLocation(Config.AUTHEN_KEY,locationModel).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<List<LocationModel>>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }

    fun postOperator(operatorModel: OperatorModel): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<List<OperatorModel>>>()
        teleserviceApi.postOperator(Config.AUTHEN_KEY,operatorModel).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<List<OperatorModel>>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }

}
