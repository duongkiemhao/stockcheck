package com.siliconstack.stockcheck.di

import com.siliconstack.stockcheck.api.GoogleVisionApi
import com.siliconstack.stockcheck.api.OCRApi
import com.siliconstack.stockcheck.api.TeleserviceApi
import com.siliconstack.stockcheck.repository.HomeRepository
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

/**
 * Created by bsobat on 26/05/17.
 */
@Module
class RepositoryModule{

    @Provides
    @Singleton
    fun provideAppRepository(OCRApi: OCRApi,teleserviceApi: TeleserviceApi,googleVisionApi: GoogleVisionApi,okHttpClient: OkHttpClient): HomeRepository {
        return HomeRepository(OCRApi,teleserviceApi,googleVisionApi,okHttpClient)
    }


}