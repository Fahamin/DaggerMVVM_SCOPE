package com.fahamin.daggermvvm_scope.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fahamin.daggermvvm_scope.Product
import com.fahamin.daggermvvm_scope.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private var repository: ProductRepository) : ViewModel() {

    var products = repository._products

    init {
        viewModelScope.launch {
            repository.getProduct()
        }
    }
}