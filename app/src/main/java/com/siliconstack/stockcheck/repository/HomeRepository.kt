package com.siliconstack.stockcheck.repository


import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.google.gson.JsonElement
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.api.GoogleVisionApi
import com.siliconstack.stockcheck.api.OCRApi
import com.siliconstack.stockcheck.api.TeleserviceApi
import com.siliconstack.stockcheck.config.Config
import com.siliconstack.stockcheck.model.*
import com.siliconstack.stockcheck.view.helper.PreferenceHelper
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class HomeRepository (val OCRApi: OCRApi,val teleserviceApi: TeleserviceApi,val googleVisionApi: GoogleVisionApi,val okHttpClient: OkHttpClient) : BaseRepository() {


    fun createOcrApiInstance():OCRApi{
        return Retrofit.Builder()
                .baseUrl(PreferenceHelper.getBaseURL())
                .addConverterFactory(GsonConverterFactory.create(AppApplication.gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build().create(com.siliconstack.stockcheck.api.OCRApi::class.java)!!
    }

    fun getDriverLicence(token:String,ocrRequest: OCRRequest): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<JsonElement>>()
        createOcrApiInstance().getOCRDriverLicence("Bearer $token",ocrRequest).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<JsonElement>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }
    fun getVin(token:String,ocrRequest: OCRRequest): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<JsonElement>>()
        createOcrApiInstance().getVin("Bearer $token",ocrRequest).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<JsonElement>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }

    fun getRego(token:String,ocrRequest: OCRRequest): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<JsonElement>>()
        createOcrApiInstance().getRego("Bearer $token",ocrRequest).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<JsonElement>(data) {})
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

    fun getGoogleVision(url:String,googleVisionRequest: GoogleVisionRequest): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<GoogleVisionResponse>>()

        googleVisionApi.get(url, googleVisionRequest).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<GoogleVisionResponse>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }
    fun getCarDetail(token:String,ocrRequest: OCRRequest): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<JsonElement>>()
        createOcrApiInstance().getCarDetail("Bearer $token",ocrRequest).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<JsonElement>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }
    fun getOCRAuth(ocrAuthRequest: OCRAuthRequest): LiveData<Resource<BaseApiResponse>> {
        var data = MutableLiveData<Resource<OCRAuthenResponse>>()
        OCRApi.authenOCR(ocrAuthRequest).enqueue(object : BaseRepository.Companion.MyRetrofitCallback<OCRAuthenResponse>(data) {})
        return data as MutableLiveData<Resource<BaseApiResponse>>
    }
}

