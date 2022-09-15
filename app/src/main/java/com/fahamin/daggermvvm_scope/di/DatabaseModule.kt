package com.fahamin.daggermvvm_scope.di

import android.content.Context
import androidx.room.Room
import com.fahamin.daggermvvm_scope.db.FackerDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton



@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesFakerDB(@ApplicationContext context: Context): FackerDB {
        return Room.databaseBuilder(context, FackerDB::class.java, "FakerDB").build()
    }
}