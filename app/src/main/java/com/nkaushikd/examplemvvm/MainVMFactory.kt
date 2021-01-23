package com.nkaushikd.examplemvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainVMFactory(private val initialValue: Int) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainVM::class.java)){
            return MainVM(initialValue) as T
        }

        throw IllegalArgumentException("Invalid arguments")
    }

}