package com.example.dentalfirstaid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ToothType(
    val toothType: String,
    @StringRes
    val toothText: Int,
    @DrawableRes
    val imageResourceId: Int,
)
