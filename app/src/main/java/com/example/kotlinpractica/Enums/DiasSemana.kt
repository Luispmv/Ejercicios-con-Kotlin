package com.example.kotlinpractica.Enums

enum class DiasSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;

    fun mensajeDia(dia:DiasSemana){
        when(dia) {
            LUNES -> println("Hoy es lunes")
            MARTES -> println("Hoy es martes")
            MIERCOLES -> println("Hoy es miércoles")
            JUEVES -> println("Hoy es jueves")
            VIERNES -> println("Hoy es viernes")
            SABADO, DOMINGO -> println("Es fin de semana")
        }
    }
}

fun main(){
    val lunes = DiasSemana.LUNES
    lunes.mensajeDia(lunes)
}