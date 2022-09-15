package com.fahamin.daggermvvm_scope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.fahamin.daggermvvm_scope.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    val textView: TextView
        get() = findViewById(R.id.productTv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.products.observe(this, Observer {
            textView.text = it.joinToString { x -> x.title + "\n\n" }
        })
    }
}