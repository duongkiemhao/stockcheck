package com.siliconstack.stockcheck.api

import com.siliconstack.stockcheck.BuildConfig
import com.siliconstack.stockcheck.model.GoogleVisionRequest
import com.siliconstack.stockcheck.model.GoogleVisionResponse
import com.siliconstack.stockcheck.model.OCRModel
import com.siliconstack.stockcheck.model.OCRRequest
import retrofit2.Call
import retrofit2.http.*

interface GoogleVisionApi {
    @POST
    fun get(@Url  url:String, @Body googleVisionRequest: GoogleVisionRequest): Call<GoogleVisionResponse>
}
