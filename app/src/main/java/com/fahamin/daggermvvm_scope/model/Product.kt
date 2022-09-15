package com.fahamin.daggermvvm_scope

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.fahamin.daggermvvm_scope.model.ObjetTypeConverters
import com.google.gson.annotations.SerializedName


@Entity
data class Product(

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("price") var price: Double? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("category") var category: String? = null,
    @SerializedName("image") var image: String? = null,
    @TypeConverters(ObjetTypeConverters::class)
    @SerializedName("rating") var rating: Rating? = Rating()

)