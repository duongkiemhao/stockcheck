package com.siliconstack.stockcheck.api

import com.siliconstack.stockcheck.BuildConfig
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
    @GET("GlassGuide/Makes")
    fun getMake(): Call<List<String>>
    @GET("GlassGuide/Models")
    fun getModel(@Query("make") make :String?): Call<List<String>>
    @GET("GlassGuide/CarDetail")
    fun getCarDetail(@Query("year") year :String?,@Query("make") make :String?,
                     @Query("family") family :String?,
                     @Query("variant") variant :String?): Call<List<CarModel>>
}
