package com.example.kotlinpractica.Clases
//Clase Estudiante: Crea una clase Estudiante que herede de la clase Persona (ejercicio 1) y agregue las propiedades matricula y carrera.
// Implementa un método mostrarDatosAcademicos() que imprima en consola la información académica del estudiante.

class Estudiante(nombre:String, edad:Int, ciudad:String, val matricula:Int, val carrera:String):Persona(nombre, edad, ciudad) {
    fun mostrarDatosAcademicos(){
        println("Nombre: ${nombre}, Edad:${edad}, Matricula: ${matricula}, Carrera. ${carrera} ")
    }
}