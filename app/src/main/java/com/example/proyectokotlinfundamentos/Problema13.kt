package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 13 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema13()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema13() {
    // Desarrolle aquí la lógica
    println("Dame un numero:")
    val numero = readln().toInt()
    val unidad = numero % 10
    val decena = (numero/10) % 10
    val centena = ((numero/10)/10)
    if ((unidad>decena)&&(decena>centena)) {
        println("SÍ")
    } else {
        println("NO")
    }
}