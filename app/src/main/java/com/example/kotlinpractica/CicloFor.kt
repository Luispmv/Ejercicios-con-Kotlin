package com.example.kotlinpractica

fun main(){
    // Implementacion sumarLista
    var listaNumeros = listOf(1,2,3,4,5,6,7,8,9,10)
    var call = sumarLista(listaNumeros)
    println(call)
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


//Tabla de multiplicar: Escribe un programa que imprima
// la tabla de multiplicar del número que el usuario introduzca.
// Usa un ciclo for para calcular y mostrar los resultados
// desde el 1 hasta el 10.

//Promedio de notas: Crea un mapa con nombres de estudiantes
// como claves y sus notas como valores.
// Usa un ciclo for para calcular el promedio de todas las notas.

//Números pares en un rango: Usa un ciclo for para
// imprimir todos los números pares entre 1 y 50.


//Factorial de un número: Pide al usuario que introduzca un
// número entero y calcula su factorial usando un ciclo for.


//Contar palabras en una lista: Dada una lista de palabras,
// utiliza un ciclo for para contar cuántas veces aparece
// una palabra específica en la lista.


//Encuentra el valor máximo en una lista:
// Crea una lista de números y usa un ciclo for para encontrar
// el valor más alto.


//Revertir una cadena: Pide al usuario que introduzca una cadena.
// Usa un ciclo for para recorrerla al revés y construir la cadena invertida,
// luego muestra el resultado.

//Filtrar números mayores a un valor dado:
// Dada una lista de números enteros,
// usa un ciclo for para filtrar los números mayores a
// un valor dado y agrégalos a una nueva lista. Al final, imprime esta lista.