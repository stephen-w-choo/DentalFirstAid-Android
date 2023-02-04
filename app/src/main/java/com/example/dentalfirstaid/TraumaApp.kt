package com.example.dentalfirstaid

import androidx.annotation.StringRes
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dentalfirstaid.data.TraumaAppData.ToothTreatments
import com.example.dentalfirstaid.ui.*

enum class TraumaScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Disclaimer(title = R.string.disclaimer_screen),
    Tooth(title = R.string.tooth_screen),
    Injury(title = R.string.injury_screen),
    Instructions(title = R.string.instructions_screen),
}

@Composable
fun TraumaAppBar(
    currentScreen: TraumaScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )
}


@Composable
fun TraumaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    val viewModel: TraumaViewModel = viewModel()
    val uiState = viewModel.uiState.collectAsState().value

    val backStackEntry by navController.currentBackStackEntryAsState()

    val currentScreen = TraumaScreen.valueOf(
        backStackEntry?.destination?.route ?: TraumaScreen.Start.name
        // nullable + elvis operator means that if the backstack returns null
        // we give the default screen
    )

    Scaffold(
        topBar = {
            TraumaAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) {
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
                    onNext = {
                        navController.navigate(TraumaScreen.Tooth.name)
                    }
                )
            }
            composable(route = TraumaScreen.Tooth.name) {
                TraumaToothScreen(
                    onNext = { navController.navigate(TraumaScreen.Injury.name) },
                    updateToothType = { viewModel.updateCurrentToothType(it) }
                )
            }
            composable(route = TraumaScreen.Injury.name) {
                TraumaInjuryScreen(
                    onNext = { navController.navigate(TraumaScreen.Instructions.name) },
                    updateToothInjury = { viewModel.updateCurrentInjuryType(it) }
                )
            }
            composable(route = TraumaScreen.Instructions.name) {
                if (uiState.currentToothType != null && uiState.currentInjury != null) {
                    // note - this feels wrong - the idea here was that if it's null it won't let it proceed
                    // but I've had to wrap it in the get/let methods in order to prevent a type error
                    // it works but feels extremely hacky
                    // I suspect I've misunderstood nullability and the type system
                    ToothTreatments[uiState.currentToothType]?.get(uiState.currentInjury)
                        ?.let { it1 ->
                            TraumaInstructionsScreen(
                                instructions = it1
                            )
                        }
                }
            }
        }
    }
}