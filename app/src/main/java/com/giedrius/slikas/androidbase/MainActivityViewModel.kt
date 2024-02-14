package com.giedrius.slikas.androidbase

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {

    var count = MutableStateFlow(1)

    fun increaseCount() {
        count.value++
    }

    fun decreaseCount() {
        count.value--
    }
}
