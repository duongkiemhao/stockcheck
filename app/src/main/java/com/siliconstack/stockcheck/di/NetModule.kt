package com.siliconstack.stockcheck.di

import com.google.gson.Gson
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.BuildConfig

import com.siliconstack.stockcheck.api.OCRApi
import com.siliconstack.stockcheck.api.TeleserviceApi
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetModule() {



    @Singleton
    @Provides
    fun provideOkHttpClient(app: AppApplication): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val cacheDir = File(app.cacheDir, UUID.randomUUID().toString())
        // 10 MiB cache
        val cache = Cache(cacheDir, 10 * 1024 * 1024)

        return OkHttpClient.Builder()
                .cache(null)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build()
    }


    @Provides
    fun provideAppApi(gson: Gson, okHttpClient: OkHttpClient): OCRApi {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.SERVER_OCR_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build().create(OCRApi::class.java)
    }

    @Provides
    fun provideTeleserviceApi(gson: Gson, okHttpClient: OkHttpClient): TeleserviceApi {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.SERVER_TELESERVICE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build().create(TeleserviceApi::class.java)
    }

}