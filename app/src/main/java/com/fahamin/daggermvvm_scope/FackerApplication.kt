package com.fahamin.daggermvvm_scope

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FackerApplication: Application() {
   // lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        // before use factory
        //applicationComponent = DaggerApplicationComponent.builder().build()

        // after use factory passing context
     //   applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}