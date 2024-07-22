package com.dm.berxley.bankapp.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _selectedBottomIndex = mutableStateOf(0)
    val selectedBottomIndex = _selectedBottomIndex

    fun setBottomIndex(int: Int){
        _selectedBottomIndex.value = int
    }

}