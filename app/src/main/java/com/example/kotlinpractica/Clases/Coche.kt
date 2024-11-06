package com.example.kotlinpractica.Clases
//Clase Coche: Crea una clase Coche con las propiedades marca, modelo, color y velocidad.
// Implementa métodos para acelerar, frenar y mostrar la velocidad actual del coche.

class Coche(val marca:String, val modelo:String, val color:String, val velocidad:Int) {
    fun acelerar():Int{
        var aumento = velocidad + 120
        println("Auto acelerando")
        return aumento
    }
    fun frenar(){
        println("Frenando")
    }
    fun mostrarVelocidadActual(){
        println(velocidad)
    }
}