package com.example.appserfitv25.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val SerfitColorScheme = darkColorScheme(
    primary = CianPrincipal,
    secondary = CianPrincipal,
    background = FondoOscuro,
    surface = FondoTarjeta,
    onPrimary = TextoBlanco,
    onSecondary = TextoBlanco,
    onBackground = TextoBlanco,
    onSurface = TextoBlanco,
)

@Composable
fun APPSERFITV25Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = SerfitColorScheme,
        typography = Typography,
        content = content
    )
}
