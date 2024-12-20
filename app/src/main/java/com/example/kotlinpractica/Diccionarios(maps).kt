package com.example.kotlinpractica

fun main(){
//    mapCreation()
//    println( contarCaracteres("Amigablea"))
//    println(listaMap(arrayListOf("gato", "perro", "perro", "loro", "garza", "toro", "perro")))
//    var myMap = mutableMapOf("Luis" to 9, "Pedro" to 10, "Arion" to 8, "Mario" to 7, "Zaid" to 9)
//    println(calificacionesAlumnos(myMap))
    var productos = mutableMapOf("Doritos" to 20, "Chips" to 15, "Sabritas" to 12)
    var call = buscarProducto(productos, "Chips")
    println(call)
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

fun contarCaracteres(cadena:String):Map<Char,Int>{
    var frecuencia= mutableMapOf<Char, Int>()
    for(letra in cadena){
        if(letra in frecuencia){
            frecuencia[letra] = frecuencia[letra]!!+1
        }else{
            frecuencia[letra] = 1
        }
    }
    return frecuencia
}



//Convertir una Lista a un Map
//Crea una lista de animales, esta lista conviértela a un Map donde cada animal es la clave y
// el valor es el numero de veces que aparece en la lista.

fun listaMap(animales:ArrayList<String>):Map<String, Int>{
    var animaldict= mutableMapOf<String, Int>()
    for(animal in animales){
        if(animal in animaldict){
            animaldict[animal] = animaldict[animal]!!+1
        }else{
            animaldict[animal] = 1
        }
    }
    return animaldict
}



//Calcular Promedio de Calificaciones
//Crea un map inmutable llamado Calificaciones que contenga nombres de estudiantes como claves y su calificación como valor.
//Escribe una función que calcule el promedio de las calificaciones de todos los estudiantes en el Map.

fun calificacionesAlumnos(alumnos:Map<String, Int>):Double{
    var array = alumnos.values.toList()
//    var suma = 0
//    for(numero in array){
//        suma += numero
//    }
//    var resultado = suma / array.size
    var resultado = array.sum().toDouble() / array.size
    return resultado
}


//Buscar en un Diccionario de Productos
//Crea un Map llamado productos donde las claves sean nombres de productos.
//Escribe una función llamada buscarProducto que reciba el Map y el nombre de un producto y
// devuelva el precio si el producto existe, o un mensaje que diga "Producto no encontrado"

fun buscarProducto(arrayProductos:Map<String, Int>, producto:String):Any{
    for((item, value) in arrayProductos){
        if(producto == item){
            return "${item} : $${value}"
        }
    }
    return "Producto no encontrado"
}