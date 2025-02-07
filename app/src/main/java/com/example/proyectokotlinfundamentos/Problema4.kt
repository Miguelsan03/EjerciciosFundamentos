package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    println("Ingresa valor artículo 1:")
    val a = readlnOrNull()?.toDoubleOrNull()
    println("Ingresa valor artículo 2:")
    val b = readlnOrNull()?.toDoubleOrNull()
    println("Ingresa valor artículo 3:")
    val c = readlnOrNull()?.toDoubleOrNull()
    if (a!!>0 && b!!>0 && c!!>0 ) {
        val neto = a + b + c
        val imp = neto*1.18
        println("Valor neto: $neto\nValor total: $imp")
    }
}