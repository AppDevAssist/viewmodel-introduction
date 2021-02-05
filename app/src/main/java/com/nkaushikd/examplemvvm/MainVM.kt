package com.nkaushikd.examplemvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVM(initialValue: Int) : ViewModel() {
    private var _counter = MutableLiveData<Int>()
    val imageUrl = "https://cdn.pixabay.com/photo/2021/01/23/13/01/hills-5942468_1280.jpg"

    val counter: LiveData<Int>
        get() = _counter

    init {
        _counter.value = initialValue
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun decrementValue(){
        _counter.value = _counter.value?.minus(1)
    }

    fun incrementValue(){
        _counter.value = _counter.value?.plus(1)
    }
}