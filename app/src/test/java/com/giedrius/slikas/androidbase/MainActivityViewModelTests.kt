package com.giedrius.slikas.androidbase

import com.giedrius.slikas.androidbase.MainActivityViewModel.Companion.DECREASED_AMOUNT_TEXT
import com.giedrius.slikas.androidbase.MainActivityViewModel.Companion.INCREASED_AMOUNT_TEXT
import junit.framework.TestCase.assertEquals
import org.junit.Test

class MainActivityViewModelTests {
    private val viewModel: MainActivityViewModel = MainActivityViewModel()

    @Test
    fun `increaseCount() increases count`() {
        viewModel.count.value = 0
        viewModel.increaseCount()
        val expected = 1
        val actual = viewModel.count.value
        assertEquals(expected, actual)
    }

    @Test
    fun `decreaseCount() decreases count`() {
        viewModel.count.value = 0
        viewModel.decreaseCount()
        val expected = -1
        val actual = viewModel.count.value
        assertEquals(expected, actual)
    }

    @Test
    fun `increaseCount() triggers a message change`() {
        viewModel.text.value = ""
        viewModel.increaseCount()
        val expected = INCREASED_AMOUNT_TEXT
        val actual = viewModel.text.value
        assertEquals(expected, actual)
    }

    @Test
    fun `decreaseCount() triggers a message change`() {
        viewModel.text.value = ""
        viewModel.decreaseCount()
        val expected = DECREASED_AMOUNT_TEXT
        val actual = viewModel.text.value
        assertEquals(expected, actual)
    }
}
