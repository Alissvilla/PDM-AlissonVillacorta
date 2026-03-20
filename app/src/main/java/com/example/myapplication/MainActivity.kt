package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        texto = ejecutarEjercicio1(), //Cambiar nùmero de ejercicio a visualizar
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(texto: String, modifier: Modifier = Modifier) {
    Text(
        text = texto,
        modifier = modifier,
        maxLines = Int.MAX_VALUE
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme(){
        Greeting(ejecutarEjercicio1()) //Cambiar nùmero de ejercicio a visualizar
    }
}

fun ejecutarEjercicio1(): String {
    val computadora = Computadora(
        marca = "HP",
        procesador = "Intel i5",
        ram = 8,
        almacenamiento = 256,
        sistemaOperativo = "Windows 10",
        programasInstalados = mutableListOf(
            "Notion 2026",
            "Facebook 2024",
            "Spotify 2026",
            "Word 2025"
        )
    )

    val programasDelAnio = computadora.programasInstalados.filter { it.contains("2026") }

    return buildString {
        appendLine("Marca: ${computadora.marca}")
        appendLine("Procesador: ${computadora.procesador}")
        appendLine("RAM: ${computadora.ram} GB")
        appendLine("Almacenamiento: ${computadora.almacenamiento} GB")
        appendLine("SO: ${computadora.sistemaOperativo}")
        appendLine("Programas de 2026:")
        programasDelAnio.forEach { appendLine(it) }
    }
}

fun ejecutarEjercicio2(): String {
    val calculadora = Calculadora(
        marca = "Casio",
        aniosDeVida = 5,
        precio = 25.50
    )

    return buildString {
        appendLine("Marca: ${calculadora.marca}")
        appendLine("Años de vida: ${calculadora.aniosDeVida}")
        appendLine("Precio: $${calculadora.precio}")
        appendLine("Suma: ${calculadora.sumar(8.0, 2.0)}")
        appendLine("Resta: ${calculadora.restar(8.0, 2.0)}")
        appendLine("Multiplicación: ${calculadora.multiplicar(8.0, 2.0)}")
        appendLine("División: ${calculadora.dividir(8.0, 2.0)}")
        appendLine(calculadora.dividir(8.0, 0.0))
    }
}

fun ejecutarEjercicio3(): String {
    val Ciclo01 = listOf(
        Estudiante("Kevin Rivas", "RM001", "Programación de Dispositivos Móviles"),
        Estudiante("Ana López", "RM002", "Programación de Dispositivos Móviles"),
        Estudiante("Carlos Pérez", "RM003", "Programación de Dispositivos Móviles"),
        Estudiante("María García", "AN001", "Análisis numérico"),
        Estudiante("José Martínez", "AN002", "Análisis numérico"),
        Estudiante("Lucía Hernández", "AN003", "Análisis numérico"),
        Estudiante("Pedro Ramírez", "AN004", "Análisis numérico")
    )

    val estudiantesPDM = Ciclo01.filter {
        it.asignatura == "Programación de Dispositivos Móviles"
    }

    return buildString {
        appendLine("=== Estudiantes PDM ===\n")

        estudiantesPDM.forEach {
            appendLine("Nombre: ${it.nombre}")
            appendLine("Carnet: ${it.carnet}")
            appendLine()
        }
    }
}