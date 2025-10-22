// Parte 5 - Modificación de main para iniciar navegación
package com.example.actividad_2_3_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.actividad_2_3_3.navigation.AppNavigation
import com.example.actividad_2_3_3.ui.theme.Actividad_2_3_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividad_2_3_3Theme {
                Scaffold { innerPadding ->
                    // se inserta el flujo de navegación en lugar de Greeting()
                    Box(modifier = Modifier.padding(innerPadding)) {
                        AppNavigation()
                    }
                }
            }
        }
    }
}

