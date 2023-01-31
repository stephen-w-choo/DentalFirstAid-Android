package com.example.dentalfirstaid

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

enum class TraumaScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Disclaimer(title = R.string.disclaimer_screen),
    Tooth(title = R.string.tooth_screen),
    Injury(title = R.string.injury_screen),
    Instructions(title = R.string.instructions_screen),
}

@Composable
fun TraumaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    val backStackEntry by navController.currentBackStackEntryAsState()

    val currentScreen = TraumaScreen.valueOf(
        backStackEntry?.destination?.route ?: TraumaScreen.Start.name
        // nullable + elvis operator means that if the backstack returns null
        // we give the default screen
    )

    NavHost(
        navController = navController,
        startDestination = TraumaScreen.Start.name,
        modifier = modifier
    ) {
        composable(route = TraumaScreen.Start.name) {
            TraumaStartScreen(
                onNext = {
                    navController.navigate(TraumaScreen.Disclaimer.name)
                }
            )
        }
        composable(route = TraumaScreen.Disclaimer.name) {
            TraumaDisclaimerScreen(
                onNext = {}
            )
        }
        composable(route = TraumaScreen.Tooth.name){

        }
        composable(route = TraumaScreen.Injury.name){

        }
        composable(route = TraumaScreen.Instructions.name){

        }
    }

}