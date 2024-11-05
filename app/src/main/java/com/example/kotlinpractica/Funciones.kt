package com.example.kotlinpractica

fun main(){
//    println( areaRectangulo(10,30))
//    println(parImpar(21))
//    println(elementoMayor(listOf(1,2,3,4,5,34,43,34,21,56,78,9,90)))
//    println(esPalindromo("malo"))
//    println(sumaN(1,255))
}

// Nivel basico
//Escribe una función que calcule el área de un rectángulo.
fun areaRectangulo(base:Int, altura:Int):Double{
    var resultado = base * altura
    return resultado.toDouble()
}

//Escribe una función que determine si un número es par o impar.
fun parImpar(numero:Int):Any{
    if (numero%2==0){
        return "${numero} es par"
    }else{
        return "${numero} es impar"
    }
}


// Nivel intermedio
//Escribe una función que encuentre el elemento más grande en una lista de números.
fun elementoMayor(lista:List<Int>):Int{
    var mayor = lista[0]
    for(numero in lista){
        if(numero > mayor){
            mayor = numero
        }
    }
    return mayor
}

//Escribe una función que determine si una cadena de texto es un palíndromo.
fun esPalindromo(palabra:String):Any{
    var reverse = palabra.reversed()
    if(palabra == reverse){
        return "${palabra} es palindromo"
    }else{
        return "${palabra} no es palindromo"
    }
}


//Escribe una función que calcule la suma de todos los números en un rango dado.
fun sumaN(primero:Int, ultimo:Int):Int{
    var suma = 0
    for(i in primero..ultimo){
        suma += i
    }
    return suma
}