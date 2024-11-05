package com.example.kotlinpractica
import kotlin.random.Random

fun main(){
//    contadorDecreciente()
//    sumaNumeros()
    adivinarNumero()
}

//1.Contador decreciente:
//Escribe un programa que comience con un número entero dado y,
//usando un ciclo `while`, imprima todos los números desde ese
//número hasta 0 en orden descendente.

fun contadorDecreciente(){
    var n = 10
    while (n>0){
        n-= 1
        println(n)
    }
}

//2.Suma de números hasta un límite:
//Pide al usuario que introduzca números uno por uno.
//Continúa sumando estos números mientras la suma sea menor a 100.
//Usa un ciclo `while` y muestra el total cuando la suma alcanza
//o supera el límite.

fun sumaNumeros(){
    val usuario = readLine()?.toIntOrNull()
    var suma = 0
    while(suma<100){
        println("Introduce un numero")
        val usuario = readLine()?.toIntOrNull()
        if (usuario != null) {
            suma += usuario
        }
    }
    print("La suma final es ${suma}")
}



//3.Adivinar un número: Genera un número aleatorio entre 1 y 50.
//Pide al usuario que lo adivine y dale pistas de si su respuesta es
//mayor o menor que el número aleatorio.
//Usa un ciclo `while` para permitirle seguir adivinando hasta que acierte.

fun adivinarNumero(){
    val random = Random
    var aleatorio = random.nextInt(1,10)
    var usuario = readLine()?.toIntOrNull()
    while(usuario != aleatorio){
        println("Introduce un numero: ")
        var usuario = readLine()?.toIntOrNull()

        if (usuario == aleatorio) {
            break
        }
    }
}
