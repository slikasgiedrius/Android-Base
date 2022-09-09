package com.giedrius.slikas.androidbase

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.giedrius.slikas.androidbase.compose.base.MyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  private val viewModel: MainActivityViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyTheme {
        MainContent(viewModel.text.value)
      }
    }
    handleObservers()
  }

  private fun handleObservers() {
    //Handle your observers here
  }
}