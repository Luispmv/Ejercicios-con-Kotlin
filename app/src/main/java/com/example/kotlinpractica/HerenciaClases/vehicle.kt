package com.example.kotlinpractica.HerenciaClases

open class vehicle(val marca:String, val modelo:String, val año:Int) {
    open fun encendido(){
        println("Vehiculo encendido")
    }
    open fun acelercion(){
        println("Vehiculo acelerando")
    }
}

class car(marca:String, modelo:String, año:Int):vehicle(marca, modelo, año){
    override fun encendido() {
        println("Automovil ${modelo} encendido")
    }
}

class motorcycle(marca:String, modelo:String, año:Int):vehicle(marca, modelo, año){
    override fun encendido() {
        println("Motocicleta ${modelo} encendido")
    }
}

class truck(marca:String, modelo:String, año:Int):vehicle(marca, modelo, año){
    override fun encendido() {
        println("Camioneta ${modelo} encendido")
    }
}

fun main(){
    val vehiculo = vehicle("Tesla", "X",2000)
    vehiculo.encendido()

    val carro = car("Toyota", "Corolla",2015)
    carro.encendido()

    val harleyDavidson = motorcycle("Harley Davidson", "David", 2020)
    harleyDavidson.encendido()

    val volvo = truck("Volvo", "VTRUCK", 2019)
    volvo.encendido()
}