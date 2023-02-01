package com.example.dentalfirstaid.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.dentalfirstaid.data.TraumaAppData.ToothInjuries

@Composable
fun TraumaInjuryScreen(
    onNext: () -> Unit,
    updateToothInjury: (String) -> Unit,
) {
    Column(){
        ToothInjuries.forEach { toothInjury ->
            Button(
                onClick = {
                    onNext()
                    updateToothInjury(toothInjury.injuryType)
                }
            ) {
                Text(text = stringResource(toothInjury.injuryDescription))
            }
        }
    }
}