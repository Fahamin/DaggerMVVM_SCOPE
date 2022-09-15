package com.fahamin.daggermvvm_scope.rettrofit

import com.fahamin.daggermvvm_scope.Product
import retrofit2.Response
import retrofit2.http.GET

interface FackerApi {
    @GET("products")
   suspend fun getProducts():Response<List<Product>>
}