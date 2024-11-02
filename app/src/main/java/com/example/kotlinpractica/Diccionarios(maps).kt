package com.example.kotlinpractica

fun main(){
    mapCreation()
}
//Crear y Manipular un Map
//Crea un map mutable llamado países que contenga como clave algunos países y como valor su población (en millones).
//Añade un país
//Actualiza un valor
//Elimina un elemento
//Imprime el map resultante de las operaciones anteriores


fun mapCreation(){
    var countries :MutableMap<String, Int> = mutableMapOf()
    // Añadir un pais
    countries["Mexico"] = 225000000

    // Actualizar un pais
    countries["Mexico"] = 125000000

    //Eliminar un elemento
    countries.remove("Mexico")

    countries["Estados Unidos"] = 225000000
    countries["Brazil"] = 200000000
    println(countries)
}




//Contar Frecuencia de Caracteres
//Escribe una función llamada contarCaracteres que reciba un String y retorne un Map donde cada clave es un
// carácter en la cadena y el valor es la cantidad de veces que aparece



//Convertir una Lista a un Map
//Crea una lista de animales, esta lista conviértela a un Map donde cada animal es la clave y
// el valor es el numero de veces que aparece en la lista.



//Calcular Promedio de Calificaciones
//Crea un map inmutable llamado Calificaciones que contenga nombres de estudiantes como claves y su calificación como valor.
//Escribe una función que calcule el promedio de las calificaciones de todos los estudiantes en el Map.



//Agrupar por Longitud
//Escribe una función agruparPorLongitud que recibe una lista de palabras y retone un Map
// donde cada clave sea la longitud de las palabras y el valor de una lista de palabras con esa longitud.



//Buscar en un Diccionario de Productos
//Crea un Map llamado productos donde las claves sean nombres de productos.
//Escribe una función llamada buscarProducto que reciba el Map y el nombre de un producto y
// devuelva el precio si el producto existe, o un mensaje que diga "Producto no encontrado"
