package com.siliconstack.stockcheck.api

import com.google.gson.JsonElement
import com.siliconstack.stockcheck.BuildConfig
import com.siliconstack.stockcheck.model.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface OCRApi {

    @POST("Vins")
    fun getVin(@Header("Authorization") token :String, @Body ocrRequest: OCRRequest): Call<JsonElement>
    @POST("Regos")
    fun getRego(@Header("Authorization") token :String, @Body ocrRequest: OCRRequest): Call<JsonElement>


    @POST("GlassGuide/CarDetail")
    fun getCarDetail(@Header("Authorization") token :String, @Body ocrRequest: OCRRequest): Call<JsonElement>

    @POST(BuildConfig.SERVER_OCR_AUTH_URL+"Authorise")
    fun authenOCR(@Body ocrAuthRequest: OCRAuthRequest): Call<OCRAuthenResponse>

    @POST(BuildConfig.SERVER_OCR_URL+"DriverLicences")
    fun getOCRDriverLicence(@Header("Authorization") token :String, @Body ocrRequest: OCRRequest): Call<JsonElement>
}
