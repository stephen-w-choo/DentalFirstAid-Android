package com.example.dentalfirstaid.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.dentalfirstaid.R
import com.example.dentalfirstaid.data.TraumaAppData.ToothTypes

@Composable
fun TraumaStartScreen(
    onNext: ()-> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
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
    onNext: ()-> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
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

@Composable
fun TraumaToothScreen(
    onNext: () -> Unit,
    updateToothType: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(){
        ToothTypes.forEach { toothType ->
            Button(
                onClick = {
                    onNext()
                    updateToothType(toothType.toothType)
                }
            ) {
                Text(text = stringResource(id = toothType.toothText))
            }
        }
    }
}


//        ToothInjuries.forEachIndexed { index, toothInjury ->
//            Button(
//                onClick = {
//                    TraumaViewModel.updateCurrentToothType(index)
//                }
//            ) {
//                Text(text = stringResource(toothInjury.injuryDescription))
//            }
//        }
//    }