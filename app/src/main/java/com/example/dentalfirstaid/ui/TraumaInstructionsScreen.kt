package com.example.dentalfirstaid.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun TraumaInstructionsScreen(
    instructions: List<String>
) {
    LazyColumn() {
        items(instructions) {
            Text(text = it)
        }
    }
}

private fun LazyListScope.items(count: List<String>) {

}
