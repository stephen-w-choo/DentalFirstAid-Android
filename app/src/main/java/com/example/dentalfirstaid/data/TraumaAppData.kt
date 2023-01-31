package com.example.dentalfirstaid.data

import androidx.compose.ui.res.stringResource
import com.example.dentalfirstaid.R
import com.example.dentalfirstaid.model.ToothInjury
import com.example.dentalfirstaid.model.ToothType

object TraumaAppData {
    val ToothTypes = listOf(
        ToothType(
            toothText = R.string.baby_tooth_text,
            imageResourceId = R.drawable.baby_tooth
        ),
        ToothType(
            toothText = R.string.adult_tooth_text,
            imageResourceId = R.drawable.adult_tooth
        )
    )

    val ToothInjuries = listOf(
        ToothInjury(
            injuryDescription = R.string.avulsion
        ),
        ToothInjury(
            injuryDescription = R.string.intrusion
        ),
        ToothInjury(
            injuryDescription = R.string.luxation
        ),
        ToothInjury(
            injuryDescription = R.string.fracture
        )
    )
}