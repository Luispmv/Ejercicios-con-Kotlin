package com.example.kotlinpractica.Clases

class Rectangulo(val base:Int, val altura: Int) {
    fun area():Int{
        var areaRectangulo = base * altura
        return areaRectangulo
    }
    fun perimetro():Int{
        var perimetroRectangulo = 2 * (base + altura)
        return perimetroRectangulo
    }
}