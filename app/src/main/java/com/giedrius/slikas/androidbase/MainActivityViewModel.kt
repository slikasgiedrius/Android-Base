package com.giedrius.slikas.androidbase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(

) : ViewModel() {

  private val _text = MutableLiveData<String>()
  val text: LiveData<String> = _text

  init {
    _text.value = "init is done"
  }
}