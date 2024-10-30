package com.example.kotlinpractica

fun main(){
//    println(diasIdiomas("Tuesday"))
//    println(edades(20))
    println(vehiculos("car"))
}


//Conversión de días a idiomas
//Dado el nombre de un día en inglés (como "Monday"),
// devuelve el día en español ("Lunes") o en francés ("Lundi") según el idioma especificado en la función.

fun diasIdiomas(dias:String){
    when(dias){
        "Monday" -> {
            println("Lunes")
        }
        "Tuesday" ->{
            println("Martes")
        }
        "Wednesday" -> {
            println("Miercoles")
        }
        "Thursday" -> {
            println("Jueves")
        }
        "Friday" -> {
            println("Viernes")
        }
        "Saturday" -> {
            println("Sabado")
        }
        "Sunday" -> {
            println("Domingo")
        }else-> {
            println("Dia no conocido")
        }
    }
}


//Clasificación de edades
//Escribe una función que, con base en la edad de una persona,
// devuelva si es un niño, adolescente, adulto o anciano.
fun edades(edad:Int){
    when(edad){
        in 1..12->{
            println("Niño")
        }
        in 13..17->{
            println("Adolescente")
        }
        in 18..64->{
            println("Adulto")
        }

        in 65 .. 120->{
            println("Adulto Mayor")
        }
        else->{
            println("No se que seas")
        }
    }
}


//Categorías de vehículos
//Dada la categoría de un vehículo ("car", "truck", "motorcycle"),
// devuelve un tipo específico de licencia requerido ("A", "B", "C").

fun vehiculos(vehiculo:String){
    when{
        vehiculo == "car"->{
            println("A")
        }
        vehiculo == "truck"->{
            println("B")
        }
        vehiculo == "motorcycle"->{
            println("C")
        }
    }
}


//Meses del año
//Dado el número de un mes (1 para enero, 2 para febrero, etc.), devuelve el nombre del mes usando match-case.
fun MesesAño(mes:Int){
    when(mes){
        1 ->{
            println("Enero")
        }
        2 ->{
            println("Febrero")
        }
        3 ->{
            println("Marzo")
        }
        4 ->{
            println("Abril")
        }
        5 ->{
            println("Mayo")
        }
        6 ->{
            println("Junio")
        }
        7 ->{
            println("Julio")
        }
        8 ->{
            println("Agosto")
        }
        9 ->{
            println("Septiembre")
        }
        10 ->{
            println("Octubre")
        }
        11 ->{
            println("Noviembre")
        }
        12 ->{
            println("Diciembre")
        }
        else ->{
            println("No existe ese mes")
        }
    }
}
