package com.fahamin.daggermvvm_scope.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.fahamin.daggermvvm_scope.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    //for room db context to
    // dagger anywher access context this way
    //runtime value need to use factory
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }


    fun getMap( ) : Map<Class<*>,ViewModel>

}