package com.example.dentalfirstaid

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TraumaStartScreen(
    onNext: ()-> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                onNext()
            }
    ){
        Text(
            text = stringResource(id = R.string.start_description)
        )
        Text(
            text = stringResource(id = R.string.click)
        )
    }
}

@Composable
fun TraumaDisclaimerScreen(
    onNext: ()-> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                onNext()
            }
    ) {
        Text(text= stringResource(id = R.string.a_note))
        Text(text= stringResource(id = R.string.disclaimer))
        Text(text= stringResource(id = R.string.click))
    }
}