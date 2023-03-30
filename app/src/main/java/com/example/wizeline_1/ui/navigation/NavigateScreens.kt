package com.example.jetmoviesapp.presentation.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.wizeline_1.MainActivityViewModel
import com.example.wizeline_1.StartScreen
import com.example.wizeline_1.ui.presentation.ImageScreen


@Composable
fun NavigateScreens(
    navController : NavHostController,
    viewModel : MainActivityViewModel
    //paddingValues : PaddingValues,
) {
    NavHost(
        navController = navController, startDestination = Screen.Start.route,
        modifier = Modifier.padding(0.dp)
    ) {
        composable(Screen.Start.route) {
            StartScreen(
                viewModel = viewModel,
                navController = navController
            )
        }
        composable(Screen.Risas.route) {
            ImageScreen()
        }

    }
}