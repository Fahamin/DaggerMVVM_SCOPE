package com.fahamin.daggermvvm_scope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.fahamin.daggermvvm_scope.db.FackerDB
import com.fahamin.daggermvvm_scope.viewModel.MainViewModel
import com.fahamin.daggermvvm_scope.viewModel.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    @Inject
    lateinit var fackerDB: FackerDB


    val textView: TextView
        get() = findViewById(R.id.productTv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injet with component
        (application as FackerApplication).applicationComponent.inject(this)

        val map = (application as FackerApplication).applicationComponent.getMap()


        mainViewModel = ViewModelProvider(this, mainViewModelFactory).get(MainViewModel::class.java)


        mainViewModel.products.observe(this, Observer {
            textView.text = it.joinToString { x -> x.title + "\n\n" }
        })
    }
}