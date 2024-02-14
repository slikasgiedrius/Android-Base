package com.giedrius.slikas.androidbase

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun MainScreen(
    viewModel: MainActivityViewModel,
    onIncreaseButtonClicked: () -> Unit,
    onDecreaseButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    MainContent(
        state = state,
        onIncreaseButtonClicked = onIncreaseButtonClicked,
        onDecreaseButtonClicked = onDecreaseButtonClicked,
        modifier = modifier,
    )
}

@Composable
fun MainContent(
    state: MainActivityState,
    onIncreaseButtonClicked: () -> Unit,
    onDecreaseButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .testTag(TAG_MAIN_CONTENT_TEXT)
            .fillMaxWidth()
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (state.text.isNotEmpty()) {
            Text(
                text = state.text,
            )
        }
        Text(
            text = state.count.toString(),
        )
        Button(
            modifier = Modifier
                .testTag(TAG_INCREASE_BUTTON),
            onClick = onIncreaseButtonClicked,
        ) {
            Text(text = "Increase count")
        }

        Button(
            modifier = Modifier
                .testTag(TAG_DECREASE_BUTTON),
            onClick = onDecreaseButtonClicked,
        ) {
            Text(text = "Decrease count")
        }
    }
}

const val TAG_INCREASE_BUTTON = "TAG_INCREASE_BUTTON"
const val TAG_DECREASE_BUTTON = "TAG_DECREASE_BUTTON"
const val TAG_MAIN_CONTENT_TEXT = "TAG_MAIN_CONTENT_TEXT"

@Preview(showSystemUi = true)
@Composable
private fun PreviewMainContent() {
    MainContent(
        state = MainActivityState(
            text = "",
            count = 1,
        ),
        onIncreaseButtonClicked = {},
        onDecreaseButtonClicked = {},
    )
}
