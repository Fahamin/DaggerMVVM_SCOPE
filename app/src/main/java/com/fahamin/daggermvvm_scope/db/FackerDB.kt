package com.fahamin.daggermvvm_scope.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.fahamin.daggermvvm_scope.Product
import com.fahamin.daggermvvm_scope.model.ObjetTypeConverters


@Database(entities = [Product::class], version = 1)
@TypeConverters(ObjetTypeConverters::class)
abstract class FackerDB : RoomDatabase() {

    abstract fun getFakeDao(): FakerDao
}