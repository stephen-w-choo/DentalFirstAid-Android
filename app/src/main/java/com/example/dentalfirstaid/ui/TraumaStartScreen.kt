package com.example.dentalfirstaid.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dentalfirstaid.R
import com.example.dentalfirstaid.data.TraumaAppData.ToothTypes




@Composable
fun TraumaStartScreen(
    onNext: ()-> Unit,
    modifier: Modifier = Modifier,
    onBackPressed: ()-> Unit,
){
    BackHandler {
        onBackPressed()
    }
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
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .clickable {
                        onNext()
                    },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painter = painterResource(id = R.drawable.splash_image),
                    contentDescription = "Image of a broken tooth",
                    modifier = modifier
                        .padding(16.dp)
                        .clip(RoundedCornerShape(50))
                )
                Text(
                    text = stringResource(id = R.string.start_description),
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(32.dp)
                )
                Text(
                    text = stringResource(id = R.string.click),
                    style = MaterialTheme.typography.h5,
                    modifier = modifier
                        .padding(32.dp)
                )
            }
        }
    }
}

@Composable
fun TraumaDisclaimerScreen(
    onNext: ()-> Unit = {},
    modifier: Modifier = Modifier,
    onBackPressed: ()-> Unit,
){
    BackHandler {
        onBackPressed()
    }
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
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .clickable {
                        onNext()
                    }
            ) {

                Text(
                    text = stringResource(id = R.string.a_note),
                    style = MaterialTheme.typography.h5,
                    modifier = modifier
                        .padding(16.dp)
                )
                Text(
                    text = stringResource(id = R.string.disclaimer1),
                    style = MaterialTheme.typography.h5,
                    modifier = modifier
                        .padding(16.dp)
                )
                Text(
                    text = stringResource(id = R.string.disclaimer2),
                    style = MaterialTheme.typography.h5,
                    modifier = modifier
                        .padding(16.dp)
                )
                Text(
                    text = stringResource(id = R.string.click),
                    style = MaterialTheme.typography.h5,
                    modifier = modifier
                        .padding(16.dp)
                )
            }
        }
    }
}

@Composable
fun TraumaToothScreen(
    onNext: () -> Unit,
    updateToothType: (String) -> Unit,
    modifier: Modifier = Modifier,
    onBackPressed: ()-> Unit,
){
    BackHandler {
        onBackPressed()
    }
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
            Column(
                modifier = modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                ToothTypes.forEach { toothType ->
                    Button(
                        onClick = {
                            onNext()
                            updateToothType(toothType.toothType)
                        },
                        modifier = modifier
                            .padding(16.dp)
                    ) {
                        Text(
                            text = stringResource(id = toothType.toothText),
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