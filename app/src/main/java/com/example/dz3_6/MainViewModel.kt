package com.example.dz3_6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    private var counter = 0
    private var plus = ""
    val mCounter = MutableLiveData<Int>()
    val mText = MutableLiveData<String>()

    fun onIncrementClick(){
        counter++
        mCounter.value = counter
        plus = "\n + $plus"
        mText.value = plus
    }
    fun onIncrementClickMinus(){
        counter--
        mCounter.value = counter
        plus = "\n - $plus"
        mText.value = plus
    }
}