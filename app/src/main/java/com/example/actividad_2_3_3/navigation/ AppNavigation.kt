package com.example.actividad_2_3_3.navigation
// PASO 5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel.compose.viewModel
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

    //Aquí creamos el ViewModel una sola vez
    val usuarioViewModel: UsuarioViewModel = viewModel ()

    NavHost(
        navController = navController,
        startDestination = "registro"

    ){
        composable( route = "registro") {
            RegistroScreen((navController, usuarioViewModel))
        }
        composable( route = "resumen") {
            ResumenScreen(usuarioViewModel)
        }
    }
}