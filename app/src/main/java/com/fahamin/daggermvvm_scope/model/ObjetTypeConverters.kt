package com.fahamin.daggermvvm_scope.model

import androidx.room.TypeConverter
import com.fahamin.daggermvvm_scope.Rating
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ObjetTypeConverters {
    @TypeConverter
    fun storedStringToMyRatings(data: String?): Rating {
        val gson = Gson()
        if (data == null) {
        }
        val listType = object : TypeToken<Rating?>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun myRatingsToStoredString(myRatings: Rating?): String {
        val gson = Gson()
        return gson.toJson(myRatings)
    }
}