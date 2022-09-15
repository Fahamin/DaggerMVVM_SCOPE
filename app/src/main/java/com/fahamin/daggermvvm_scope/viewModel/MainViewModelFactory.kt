package com.fahamin.daggermvvm_scope.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import com.fahamin.daggermvvm_scope.repository.ProductRepository
import javax.inject.Inject



// FOR MULTIPLE VIEWMODEL TO ONE FACTORY
class MainViewModelFactory @Inject constructor(
    private val map: Map<Class<*>, @JvmSuppressWildcards ViewModel>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T
    }

}

/*
//dagger pass any object need to mainviewModel this way
// anything we need no change in factory file

class MainViewModelFactory @Inject constructor (
    private val mainViewModel: MainViewModel) :ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return mainViewModel as T
    }
}*/
