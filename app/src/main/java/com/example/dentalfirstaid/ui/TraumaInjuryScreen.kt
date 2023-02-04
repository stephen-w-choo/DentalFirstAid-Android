package com.example.dentalfirstaid.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dentalfirstaid.data.TraumaAppData.ToothInjuries



@Composable
fun TraumaInjuryScreen(
    onNext: () -> Unit,
    updateToothInjury: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            elevation = 10.dp,
            modifier = modifier
                .widthIn(0.dp, 400.dp)
                .fillMaxHeight()
                .padding(16.dp),
        ) {
            Column() {
                ToothInjuries.forEach { toothInjury ->
                    Button(
                        onClick = {
                            onNext()
                            updateToothInjury(toothInjury.injuryType)
                        },
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = stringResource(toothInjury.injuryDescription),
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.h5,
                            modifier = modifier
                                .padding(vertical = 16.dp)
                        )
                    }
                }
            }
        }
    }
}