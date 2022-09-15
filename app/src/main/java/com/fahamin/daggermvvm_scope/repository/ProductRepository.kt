package com.fahamin.daggermvvm_scope.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.fahamin.daggermvvm_scope.Product
import com.fahamin.daggermvvm_scope.db.FackerDB
import com.fahamin.daggermvvm_scope.rettrofit.FackerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val fackerApi: FackerApi,
    private val fackerDB: FackerDB
) {

    var _products = MutableLiveData<List<Product>>()

    suspend fun getProduct() {
        val result = fackerApi.getProducts()

        if (result.isSuccessful && result.body() != null) {

            fackerDB.getFakeDao().addProduct(result.body()!!)
            _products.postValue(result.body())
        }
    }
}