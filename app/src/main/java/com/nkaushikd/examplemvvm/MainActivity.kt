package com.nkaushikd.examplemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.nkaushikd.examplemvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainVM
    private lateinit var viewModelFactory: MainVMFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModelFactory = MainVMFactory(1000)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainVM::class.java)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMinus.setOnClickListener {
            viewModel.decrementValue()
            updateView()
        }

        binding.buttonPlus.setOnClickListener {
            viewModel.incrementValue()
            updateView()
        }

        updateView()

    }

    fun updateView(){
        binding.tvNumber.text = viewModel.getCounter().toString()
    }

}