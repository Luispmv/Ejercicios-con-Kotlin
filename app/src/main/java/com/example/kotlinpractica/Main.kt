package com.example.kotlinpractica

fun main(){
    fizzBuzz()
}

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

fun fizzBuzz(){
    for (numero in 1..100){
        if(numero%5==0 && numero%3==0){
            println("fizzbuzz")
        }else if(numero%5==0){
            println("buzz")
        }else if(numero%3==0){
            println("fizz")
        }else{
            println(numero)
        }
    }
}
