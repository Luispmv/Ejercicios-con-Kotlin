package com.example.kotlinpractica.DataClasses

import android.hardware.camera2.CameraExtensionSession.StillCaptureLatency
import com.example.kotlinpractica.Clases.Libro

data class Libros(
    val titulo:String,
    val autor:String,
    val añoPublicacion:Int,
    val isbn:String){
}

fun main(){
    println("LIBROS POR NOMBRE")
    println(encontrarLibroPorNombre("El resplandor"))

    println("LIBROS POR AUTOR")
    println(filtrarLibroPorAutor("Stephen King"))
}

fun allBooks():List<Libro>{
    val libros = listOf(
        Libro("El resplandor", "Stephen King", 1977, "9780450040185"),
        Libro("It", "Stephen King", 1986, "9780451169518"),
        Libro("La Ilíada", "Homero", 1800, "9788499083600"),
        Libro("La Odisea", "Homero", 1800, "9788499083617"),
        Libro("El principito", "Antoine de Saint-Exupéry", 1943, "9780156012195")
    )
    return libros
}

fun encontrarLibroPorNombre(nombre:String):Any{
    for(book in allBooks()){
        if(nombre == book.titulo){
            return "${book.titulo} ha sido encontrado"
        }
    }
    return "${nombre} no encontrado"
}

fun filtrarLibroPorAutor(autor:String):Any{
    var listaLibros = allBooks()
    for(book in listaLibros){
        if(autor == book.autor){
            return book.titulo
        }
    }
    return "Autor no encontrado"
}
