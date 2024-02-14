package com.giedrius.slikas.androidbase

import com.giedrius.slikas.androidbase.MainActivityViewModel.Companion.DEFAULT_COUNT
import com.giedrius.slikas.androidbase.MainActivityViewModel.Companion.DEFAULT_TEXT

data class MainActivityState(
    val text: String = DEFAULT_TEXT,
    val count: Int = DEFAULT_COUNT,
)
