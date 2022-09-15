package com.fahamin.daggermvvm_scope.db

import androidx.room.*
import com.fahamin.daggermvvm_scope.Product
import com.fahamin.daggermvvm_scope.model.ObjetTypeConverters

@TypeConverters(ObjetTypeConverters::class)
@Dao
interface FakerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProduct(product: List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProducts(): List<Product>
}