package com.example.kotlinpractica.Clases
//Clase Libro: Crea una clase Libro con las propiedades titulo, autor, añoPublicacion y genero.
// Implementa un método mostrarInformacion() que imprima en consola la información del libro.

class Libro(val titulo:String, val autor:String, val añoPublicacion:Int, val genero:String){
    fun mostrarInformacion(){
        println("Titulo: ${titulo}, Autor: ${autor}, Año Publicacion: ${añoPublicacion}, genero: ${genero}")
    }
}