package com.fahamin.daggermvvm_scope

import android.app.Application
import com.fahamin.daggermvvm_scope.di.ApplicationComponent
import com.fahamin.daggermvvm_scope.di.DaggerApplicationComponent
import dagger.hilt.android.HiltAndroidApp

class FackerApplication: Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        // before use factory
        //applicationComponent = DaggerApplicationComponent.builder().build()

        // after use factory passing context
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}