package com.example.dentalfirstaid.ui

data class TraumaUiState(
    // holds the current tooth type and injuries as integers
    // the integer will be the index that the category occupies in the list in the AppData
    // they will be null if no tooth or injury is currently selected
    val currentToothType: Int?,
    val currentInjury: Int?,
)