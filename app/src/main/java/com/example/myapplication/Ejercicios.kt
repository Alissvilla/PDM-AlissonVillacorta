package com.example.myapplication

//Ejercicio 1: Computadora
class Computadora(
    val marca: String,
    val procesador: String,
    var ram: Int,
    var almacenamiento: Int,
    var sistemaOperativo: String,
    val programasInstalados: MutableList<String>
) {

    fun encenderComputadora() {
        println("La computadora $marca está encendida.")
    }

    fun apagarComputadora() {
        println("La computadora $marca está apagada.")
    }

    fun actualizarRAM(nuevaRAM: Int) {
        ram = nuevaRAM
        println("RAM actualizada a $ram GB.")
    }

    fun actualizarAlmacenamiento(nuevoAlmacenamiento: Int) {
        almacenamiento = nuevoAlmacenamiento
        println("Almacenamiento actualizado a $almacenamiento GB.")
    }

    fun cambiarSistemaOperativo(nuevoSO: String) {
        sistemaOperativo = nuevoSO
        println("Sistema operativo cambiado a $sistemaOperativo.")
    }

    fun mostrarProgramasDelAnioActual(anio: Int) {
        val filtrados = programasInstalados.filter { it.contains(anio.toString()) }

        println("Programas del año $anio:")
        if (filtrados.isEmpty()) {
            println("No hay programas de este año.")
        } else {
            filtrados.forEach { println(it) }
        }
    }
}

// Ejercicio 2: Calculadora
class Calculadora(
    val marca: String,
    val aniosDeVida: Int,
    var precio: Double
) {

    fun sumar(a: Double, b: Double): Double {
        return a + b
    }

    fun restar(a: Double, b: Double): Double {
        return a - b
    }

    fun multiplicar(a: Double, b: Double): Double {
        return a * b
    }

    fun dividir(a: Double, b: Double): String {
        return if (b == 0.0) {
            "Error: no se puede dividir entre 0"
        } else {
            (a / b).toString()
        }
    }
}

// Ejercicio 3: Estudiante
class Estudiante(
    val nombre: String,
    val carnet: String,
    val asignatura: String
)