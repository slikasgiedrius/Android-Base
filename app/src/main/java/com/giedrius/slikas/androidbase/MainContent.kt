package com.giedrius.slikas.androidbase

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainContent(
  text: String?,
  onIncreaseButtonClicked: () -> Unit
) {
  Column(
    modifier = Modifier
      .testTag(TAG_MAIN_CONTENT_TEXT)
      .fillMaxWidth()
      .padding(all = 16.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(
      text = text ?: ""
    )
    Button(
      modifier = Modifier
        .testTag(TAG_INCREASE_BUTTON),
      onClick = onIncreaseButtonClicked
    ) {
      Text(text = "Increase count")
    }
  }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewMainContent() {
  MainContent(
    text = "Init is done",
    onIncreaseButtonClicked = {}
  )
}

const val TAG_INCREASE_BUTTON = "TAG_INCREASE_BUTTON"
const val TAG_MAIN_CONTENT_TEXT = "TAG_MAIN_CONTENT_TEXT"