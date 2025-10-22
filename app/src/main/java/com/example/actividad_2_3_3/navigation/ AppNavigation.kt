package com.example.actividad_2_3_3.navigation
// PASO 5

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.actividad_2_3_3.ui.screen.RegistroScreen
import com.example.actividad_2_3_3.ui.screen.ResumenScreen
import com.example.actividad_2_3_3.viewmodel.UsuarioViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    // Se crea el ViewModel una sola vez
    val usuarioViewModel: UsuarioViewModel = viewModel ()

    NavHost(
        navController = navController,
        startDestination = "registro"

    ){
        composable("registro") {
            RegistroScreen(navController, usuarioViewModel)
        }
        composable("resumen") {
            ResumenScreen(usuarioViewModel)
        }
    }
}