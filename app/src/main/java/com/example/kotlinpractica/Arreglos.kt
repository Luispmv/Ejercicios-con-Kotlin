package com.example.kotlinpractica

fun main(){
//    println(arregloEnteros(arrayListOf(1,2,3)))
//    println(valorMaximo(arrayListOf(1,22,90,3,76,90,230)))
//    println(elementosPares(arrayListOf(1,2,2,34,5,6,7,8,9,10,12,12,14,14)))
//    println(eliminarDuplicados(arrayListOf(1,2,3,4,8,8,8,8,9,7,6,5)))
//    println(promedioArray(arrayListOf(5,2,5,3)))
}

//Suma de elementos
//Crea una función que reciba un arreglo de números enteros
//y devuelva la suma de todos los elementos en el arreglo.
fun arregloEnteros(lista:ArrayList<Int>):Int{
    var suma = 0
    for (elemento in lista){
        suma+= elemento
    }
    return suma
}

//Elemento máximo y mínimo
//Escribe una función que encuentre el valor máximo
//y mínimo en un arreglo de enteros.

fun valorMaximo(lista: ArrayList<Int>):Int{
    var max = lista.first()
    for(numero in lista){
        if(max < numero){
            max = numero
        }
    }
    return max
}

//Contar elementos pares e impares
//Crea una función que cuente cuántos elementos son pares
//y cuántos son impares en un arreglo de enteros.
fun elementosPares(lista: ArrayList<Int>):String{
    var sumaPares = 0
    var pairs = mutableListOf<Int>()
    for(elemento in lista){
        if(elemento % 2 == 0){
            sumaPares += 1
            pairs.add(elemento)
        }
    }
    return "Array pares: ${pairs}, numero de elementos: ${sumaPares} "
}

//Eliminar duplicados
//Dado un arreglo de enteros, elimina los elementos duplicados
//y devuelve el arreglo con solo elementos únicos.

fun eliminarDuplicados(enteros:ArrayList<Int>):List<Int>{
    return enteros.toSet().toList()
}


//Promedio de elementos
//Crea una función que calcule el promedio de todos los elementos de un arreglo de enteros.
fun promedioArray(elementos:ArrayList<Int>):Int{
    return elementos.sum() / elementos.size
}
