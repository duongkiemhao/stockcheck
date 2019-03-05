package com.siliconstack.stockcheck.api

import com.siliconstack.stockcheck.model.CarModel
import com.siliconstack.stockcheck.model.OCRModel
import com.siliconstack.stockcheck.model.OCRRequest
import retrofit2.Call
import retrofit2.http.*

interface OCRApi {
    @POST("DriverLicences")
    fun getDriverLicence(@Body ocrRequest: OCRRequest): Call<OCRModel>
    @POST("Vins")
    fun getVin(@Body ocrRequest: OCRRequest): Call<OCRModel>
    @POST("Regos")
    fun getRego(@Body ocrRequest: OCRRequest): Call<OCRModel>


    @POST("GlassGuide/CarDetail")
    fun getCarDetail(@Body ocrRequest: OCRRequest): Call<List<CarModel>>
}
