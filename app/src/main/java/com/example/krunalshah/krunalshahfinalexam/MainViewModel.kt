package com.example.krunalshah.krunalshahfinalexam

import android.widget.TextView
import androidx.lifecycle.ViewModel

class MainViewModel(s: String, s1: String) : ViewModel() {
    // TODO: Implement the ViewModel

    var text1: String? = null
    var text2: String? = null

    fun MainViewModel(text1: String?, text2: String) {
        this.text1 = text1
        this.text2 = text2
    }

    fun setText(text1: String?, text2: String) {

    }
}