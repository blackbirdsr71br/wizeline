package com.example.jetmoviesapp.presentation.navigation

sealed class Screen(val route: String){
    object Risas: Screen(route = "risas")
    object Start: Screen(route = "Inicio")
}
