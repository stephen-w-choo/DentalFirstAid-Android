package com.example.dentalfirstaid.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dentalfirstaid.data.TraumaAppData.ToothTreatments
import com.example.dentalfirstaid.model.ToothTreatment

@Preview
@Composable
fun PreviewScreen() {
    ToothTreatments["baby"]?.get("avulsion")?.let { TraumaInstructionsScreen(instructions = it) }
}

@Composable
fun TraumaInstructionsScreen(
    instructions: List<String>,
    modifier: Modifier = Modifier
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
            LazyColumn(
                modifier = modifier.padding(16.dp)
            ) {
                items(instructions) {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.body1,
                        modifier = modifier
                            .padding(vertical = 4.dp))
                }
            }
        }
    }
}

private fun LazyListScope.items(count: List<String>) {

}
