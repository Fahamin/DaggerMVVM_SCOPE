package com.fahamin.daggermvvm_scope.di

import com.fahamin.daggermvvm_scope.rettrofit.FackerApi
import com.fahamin.daggermvvm_scope.utils.Constans
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit():Retrofit{
        return  Retrofit.Builder().baseUrl(Constans.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Singleton
    @Provides
    fun providesFackerApi(retrofit: Retrofit): FackerApi {
        return retrofit.create(FackerApi::class.java)
    }
}