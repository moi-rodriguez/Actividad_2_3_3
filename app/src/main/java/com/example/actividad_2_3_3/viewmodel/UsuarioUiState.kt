// Modelo que almacena posibles errores individuales del formulario

data class UsuarioErrores(
    val nombre: String? = null,
    val correo: String? = null,
    val clave: String? = null,
    val direccion: String? = null,
)




// Modelo principal que representa el estado del formulario del usuario
data class UsuarioUiState(
    val nombre: String = "",            //Nombre del Usuario
    val correo: String = "",            //Correo electrónico
    val clave: String = "",             //Contraseña
    val direccion: String = "",         //Dirección del usuario
    val aceptaTerminos: Boolean = false,     //Confirmación de términos
    val errores: UsuarioErrores = UsuarioErrores() //Objeto que contiene los errores por campo
)

