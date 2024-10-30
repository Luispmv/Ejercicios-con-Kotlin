package com.example.kotlinpractica

fun main(){
    println(diasIdiomas("Tuesday"))
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

//Categorías de vehículos
//Dada la categoría de un vehículo ("car", "truck", "motorcycle"),
// devuelve un tipo específico de licencia requerido ("A", "B", "C").

//Meses del año
//Dado el número de un mes (1 para enero, 2 para febrero, etc.), devuelve el nombre del mes usando match-case.


//Costos de envío
//Crea una función que reciba una zona de envío ("local", "nacional", "internacional")
// y devuelva el costo asociado (5, 10, 20).


//Reconocimiento de figuras geométricas
//Dada la cantidad de lados de una figura (3 para triángulo, 4 para cuadrado/rectángulo, 5 para pentágono),
// devuelve el nombre de la figura.


//Identificación de colores
//Dado un código hexadecimal de color,
// devuelve el nombre del color (por ejemplo, #FF0000 es rojo).


//Conversión de temperatura a estados de agua
//Escribe una función que, dada una temperatura en grados Celsius,
// devuelva el estado del agua ("solid", "liquid", "gas").


//Asignación de tareas según el día
//Dado el día de la semana, devuelve una tarea asignada para ese
// día (por ejemplo, "Lunes": "reunión semanal", "Miércoles": "revisión de proyecto").