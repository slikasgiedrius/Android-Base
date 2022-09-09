package com.giedrius.slikas.androidbase

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainContent(
  text: String?
) {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .padding(all = 16.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(
      text = text ?: ""
    )
  }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewMainContent() {
  MainContent(text = "Init is done")
}