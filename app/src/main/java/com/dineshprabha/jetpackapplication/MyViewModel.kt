package com.dineshprabha.jetpackapplication

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    val state = mutableStateOf(MyScreenState())

    fun updateText(newText : String){
        state.value = state.value.copy(textState = newText)
    }

    fun updateNamesList(){
        val currentList = state.value.namesListState
        currentList.add(state.value.textState)
        state.value = state.value.copy(namesListState = currentList)
    }
}