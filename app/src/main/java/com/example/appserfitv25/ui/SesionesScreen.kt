package com.example.appserfitv25.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.appserfitv25.R
import com.example.appserfitv25.ui.theme.CianPrincipal
import com.example.appserfitv25.ui.theme.FondoOscuro
import com.example.appserfitv25.ui.theme.FondoTarjeta
import com.example.appserfitv25.ui.theme.TextoBlanco
import com.example.appserfitv25.ui.theme.TextoGrisClaro

private data class Ejercicio(val titulo: String, val subtitulo: String)

@Composable
fun SesionesScreen() {
    val ejercicios = listOf(
        Ejercicio("Plancha", "30 seg"),
        Ejercicio("Sentadillas", "20 reps"),
        Ejercicio("Flexiones", "15 reps")
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Sesiones",
                        color = TextoBlanco
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "menu",
                            tint = TextoBlanco
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = CianPrincipal
                )
            )
        },
        containerColor = FondoOscuro
    ) { inner ->
        Column(
            modifier = Modifier
                .padding(inner)
                .fillMaxSize()
                .background(FondoOscuro),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_launcher_round),
                contentDescription = "Logo",
                modifier = Modifier
                    .padding(top = 24.dp)
                    .size(96.dp)
                    .clip(CircleShape)
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = CianPrincipal),
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text("Primary", color = TextoBlanco)
            }
            Text(
                text = "Ejercicios",
                color = TextoBlanco,
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp),
                textAlign = TextAlign.Start
            )
            LazyColumn(
                modifier = Modifier.fillMaxWidth()
            ) {
                items(ejercicios) { ejercicio ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = FondoTarjeta),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        Column(Modifier.padding(16.dp)) {
                            Text(ejercicio.titulo, color = TextoBlanco)
                            Text(ejercicio.subtitulo, color = TextoGrisClaro)
                        }
                    }
                }
            }
        }
    }
}

