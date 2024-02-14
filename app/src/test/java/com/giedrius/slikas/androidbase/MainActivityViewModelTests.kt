package com.giedrius.slikas.androidbase

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MainActivityViewModelTests {
    private val viewModel: MainActivityViewModel = MainActivityViewModel()

    @Test
    fun `increaseCount() increases count`() {
        viewModel.count.value = 0
        viewModel.increaseCount()

        assertEquals(1, viewModel.count.value)
    }

    @Test
    fun `decreaseCount() decreases count`() {
        viewModel.count.value = 0
        viewModel.decreaseCount()

        assertEquals(-1, viewModel.count.value)
    }
}
