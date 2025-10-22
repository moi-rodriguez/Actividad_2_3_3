// Parte 2
package com.example.actividad_2_3_3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.actividad_2_3_3.model.UsuarioErrores
import com.example.actividad_2_3_3.model.UsuarioUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class UsuarioViewModel : ViewModel() {

    // Estado interno mutable
    private val _estado = MutableStateFlow(UsuarioUiState())

    // Estado expuesto para Ui
    val estado: StateFlow<UsuarioUiState> = _estado

    // Actualiza el campo nombre y limpia su error
    fun OnNombreChange(valor: String) {
        _estado.update { it.copy(nombre = valor, errores) }
    }
}