package com.example.dentalfirstaid.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class TraumaViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(
        TraumaUiState(
            currentToothType = null,
            currentInjury = null
        )
    )
    val uiState: StateFlow<TraumaUiState> = _uiState

    fun updateCurrentToothType(toothType: String) {
        _uiState.update {
            it.copy(
                currentToothType = toothType
            )
        }
    }

    fun updateCurrentInjuryType(injury: String) {
        _uiState.update {
            it.copy(
                currentInjury = injury
            )
        }
    }
}