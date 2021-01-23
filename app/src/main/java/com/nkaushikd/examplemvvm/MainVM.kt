package com.nkaushikd.examplemvvm

import androidx.lifecycle.ViewModel

class MainVM(initialValue: Int) : ViewModel() {
    private var counter = 0

    init {
        counter = initialValue
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun decrementValue(){
        counter--
    }

    fun incrementValue(){
        counter++
    }

    fun getCounter(): Int {
        return counter
    }
}