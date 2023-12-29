package com.dineshprabha.jetpackapplication

data class MyScreenState(
    val textState: String = "",
    val namesListState : MutableList<String> = mutableListOf()
)
