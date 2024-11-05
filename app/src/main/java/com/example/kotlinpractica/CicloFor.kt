package com.example.kotlinpractica

fun main(){
    // Implementacion sumarLista
//    var listaNumeros = listOf(1,2,3,4,5,6,7,8,9,10)
//    var call = sumarLista(listaNumeros)
//    println(call)

    // Implementacion de la funcion conteoVocales
//    var palabra = "Aromatizante"
//    var call = conteoVocales(palabra)
//    println(call)

    // Implementacion de la funcion tablaMultiplicar
//    var call = tablaMultiplicar(2)

    // Implementacion de promedioEstudiantes
//    promedioEstudiantes()

    // Implementacion de numerosPares()
//    numerosPares()

    // Implementacion de valorMasAlto()
//    println(valorMasAlto())

    // Implementacion de revertirCadena()
//    println(revertirCadena("Hola"))

    println(numerosMayoresA(400))
}


//Suma de elementos en una lista:
// Crea una lista de números enteros. Utiliza un ciclo for para sumar todos
// los elementos de la lista y mostrar el resultado.
fun sumarLista(lista:List<Int>):Int{
    var suma = 0
    for(numero in lista){
        suma += numero
    }
    return suma
}


//Conteo de vocales: Pide al usuario que introduzca una palabra.
// Usa un ciclo for para recorrer cada letra de la palabra e
// incrementa un contador cada vez que encuentres una vocal (a, e, i, o, u).
fun conteoVocales(palabra:String):Any{
    var vocales = "aeiou"
    var suma = 0
    for(letra in palabra){
        if(letra in vocales){
            suma += 1
        }
    }
    return suma
}

//Tabla de multiplicar: Escribe un programa que imprima
// la tabla de multiplicar del número que el usuario introduzca.
// Usa un ciclo for para calcular y mostrar los resultados
// desde el 1 hasta el 10.

fun tablaMultiplicar(numero:Int){
    for(n in 1..10){
        var multiplicacion = numero * n
        println("${numero} X ${n} = ${multiplicacion}")
    }
}

//Promedio de notas: Crea un mapa con nombres de estudiantes
// como claves y sus notas como valores.
// Usa un ciclo for para calcular el promedio de todas las notas.

fun promedioEstudiantes(){
    var estudiantes = mapOf(
        "Pablo" to listOf(9,9,10),
        "Rodrigo" to listOf(9,8,10),
        "Mariano" to listOf(9,6,10),
        "Miguel" to listOf(9,5,10),
        "Alan" to listOf(10,10,10),
        )
    for(estudiante in estudiantes.values){
        var resultado = estudiante.sum().toDouble() / estudiante.size
        println(resultado)
    }
}


//Números pares en un rango: Usa un ciclo for para
// imprimir todos los números pares entre 1 y 50.
fun numerosPares(){
    for(numero in 1..50){
        if(numero%2==0){
            println(numero)
        }
    }
}

//Encuentra el valor máximo en una lista:
// Crea una lista de números y usa un ciclo for para encontrar
// el valor más alto.

fun valorMasAlto():Int{
    var lista = listOf(1,2,3,4,55,440,32,20,90,21,99)
    var mayor = lista[0]
    for(numero in lista){
        if(numero > mayor){
            mayor = numero
        }
    }
    return mayor
}


//Revertir una cadena: Pide al usuario que introduzca una cadena.
// Usa un ciclo for para recorrerla al revés y construir la cadena invertida,
// luego muestra el resultado.

fun revertirCadena(palabra: String):String{
    return palabra.reversed()
}

//Filtrar números mayores a un valor dado:
// Dada una lista de números enteros,
// usa un ciclo for para filtrar los números mayores a
// un valor dado y agrégalos a una nueva lista. Al final, imprime esta lista.

fun numerosMayoresA(numero:Int):List<Int>{
    var enteros = listOf(1,20,300,4000,5000)
    var mayores = mutableListOf<Int>()
    for(n in enteros){
        if(n> numero){
            mayores.add(n)
        }
    }
    return mayores
}