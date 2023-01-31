package com.example.dentalfirstaid.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TraumaViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(TraumaUiState())
    val uiState: StateFlow<TraumaUiState> = _uiState


}