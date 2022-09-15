package com.fahamin.daggermvvm_scope.di

import android.content.Context
import androidx.room.Room
import com.fahamin.daggermvvm_scope.db.FackerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesFakerDB(context: Context): FackerDB {
        return Room.databaseBuilder(context, FackerDB::class.java, "FakerDB").build()
    }
}