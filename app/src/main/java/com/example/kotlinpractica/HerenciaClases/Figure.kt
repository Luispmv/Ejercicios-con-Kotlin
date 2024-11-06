package com.example.kotlinpractica.HerenciaClases

import androidx.activity.result.PickVisualMediaRequest
import kotlin.math.PI

open class Figure(val color:String) {
    open fun calcularArea():Any{
        return "Calculo Area"
    }
    open fun calcularPerimetro():Any{
        return "Calculo Perimetro"
    }
}

class Circulo(color:String, val radio:Int):Figure(color){
    override fun calcularArea():Any{
//        area = pi X radio al cuadrado
        val area = PI * radio * radio
        return area.toInt()
    }

    override fun calcularPerimetro(): Any {
//        P=2×π×radio
        val perimetro = 2 * PI * radio
        return perimetro
    }
}

class Rectangulo(color:String, val base:Int, val altura:Int):Figure(color){
    override fun calcularArea(): Any {
        var area = base * altura
        return area
    }

    override fun calcularPerimetro(): Any {
//        P=2×(base+altura)
        var perimetro = 2 *(base + altura)
        return perimetro
    }
}

class Triangulo(color:String, val base:Int, val altura: Int, val tamañoLado:Int):Figure(color){
    override fun calcularArea(): Any {
        var area = base * altura /2
        return area
    }

    override fun calcularPerimetro(): Any {
//        P=3×lado
        var perimetro = 3 * tamañoLado
        return perimetro
    }
}

fun main(){
    var figura = Figure("Blue")
    var circulo = Circulo("Red", 20)
    var rectangulo = Rectangulo("Yellow", 20, 10)
    var triangulo = Triangulo("Purple", 10, 10, 5)

    println("AREA")
    println(circulo.calcularArea())
    println(rectangulo.calcularArea())
    println(triangulo.calcularArea())

    println("PERIMETRO")
    println(circulo.calcularPerimetro())
    println(rectangulo.calcularPerimetro())
    println(triangulo.calcularPerimetro())
}