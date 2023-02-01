package com.example.dentalfirstaid.model

import androidx.annotation.StringRes

data class ToothInjury(
    val injuryType: String,
    @StringRes
    val injuryDescription: Int,
)
