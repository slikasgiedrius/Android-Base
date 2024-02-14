package com.giedrius.slikas.androidbase

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {

    private var text = MutableStateFlow("")
    private var count = MutableStateFlow(0)

    val state = combine(
        text,
        count,
    ) { text, count ->
        MainActivityState(
            text = text,
            count = count,
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5000),
        initialValue = MainActivityState(),
    )

    fun increaseCount() {
        count.value++
        text.value = "Amount increased"
    }

    fun decreaseCount() {
        count.value--
        text.value = "Amount decreased"
    }
}
