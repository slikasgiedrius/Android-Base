package com.giedrius.slikas.androidbase

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.giedrius.slikas.androidbase.MainActivityViewModel.Companion.DEFAULT_COUNT
import org.junit.Rule
import org.junit.Test

class MainActivityTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun increaseButtonIsDisplayed() {
        composeTestRule.onNodeWithTag(TAG_INCREASE_BUTTON).assertIsDisplayed()
    }

    @Test
    fun decreaseButtonIsDisplayed() {
        composeTestRule.onNodeWithTag(TAG_DECREASE_BUTTON).assertIsDisplayed()
    }

    @Test
    fun counterIsUpdatedAfterIncreaseButtonIsClicked() {
        composeTestRule.onNodeWithText(DEFAULT_COUNT.toString()).assertIsDisplayed()

        composeTestRule.onNodeWithTag(TAG_INCREASE_BUTTON).performClick()

        composeTestRule.onNodeWithText(DEFAULT_COUNT.toString()).assertDoesNotExist()
        composeTestRule.onNodeWithText((DEFAULT_COUNT + 1).toString()).assertIsDisplayed()
    }

    @Test
    fun counterIsUpdatedAfterDecreaseButtonIsClicked() {
        composeTestRule.onNodeWithText(DEFAULT_COUNT.toString()).assertIsDisplayed()

        composeTestRule.onNodeWithTag(TAG_DECREASE_BUTTON).performClick()

        composeTestRule.onNodeWithText(DEFAULT_COUNT.toString()).assertDoesNotExist()
        composeTestRule.onNodeWithText((DEFAULT_COUNT + -1).toString()).assertIsDisplayed()
    }
}
