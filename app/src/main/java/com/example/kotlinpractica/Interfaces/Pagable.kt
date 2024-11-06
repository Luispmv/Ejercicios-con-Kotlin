package com.example.kotlinpractica.Interfaces

import kotlinx.coroutines.processNextEventInCurrentThread

interface Pagable {
    fun pagar(monto:Int):Any{
        return "Monto: ${monto}"
    }
}

class TarjetaCredito(val monto:Int, val metodoPago:String):Pagable{
    override fun pagar(monto: Int): Any {
        return "Monto: ${monto}, metodo: ${metodoPago}"
    }
}

fun main(){
    var credito = TarjetaCredito(2000, "VISA")
    println(credito.pagar(credito.monto))
}