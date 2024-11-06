package com.example.kotlinpractica.Clases

open class Persona(val nombre: String, val edad: Int, val ciudad: String) {
    fun presentarse():String{
        return "Hola mi nombr es ${nombre}, mi edad es ${edad} y mi ciudad ${ciudad}"
    }

}