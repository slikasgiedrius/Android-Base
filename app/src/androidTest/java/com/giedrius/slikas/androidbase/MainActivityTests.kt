package com.giedrius.slikas.androidbase

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
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
  fun counterIsUpdatedAfterButtonIsClicked() {
    composeTestRule.onNodeWithText("init is done. Count is 1").assertIsDisplayed()

    composeTestRule.onNodeWithTag(TAG_INCREASE_BUTTON).performClick()

    composeTestRule.onNodeWithText("init is done. Count is 1").assertDoesNotExist()
    composeTestRule.onNodeWithText("Count is 2").assertIsDisplayed()
  }
}