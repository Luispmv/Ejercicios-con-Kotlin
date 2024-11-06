package com.example.kotlinpractica.Clases

//Clase CuentaBancaria: Crea una clase CuentaBancaria con las
// propiedades titular, numeroCuenta y saldo.
// Implementa métodos para depositar y retirar dinero de la cuenta.


class CuentaBancaria(val titular:String, val numeroCuenta:Int, var saldo:Int){
    fun depositar(cuentaDestino:Int, monto:Int):Any{
        if(saldo < monto ){
            return "Saldo no suficiente"
        }
        return "Dinero depositado exitosamente"
    }
    fun retirar(monto:Int):Any{
        if(monto > saldo){
            return "Saldo insuficiente"
        }else{
            var retiro = saldo - monto
            saldo = retiro
            return saldo
        }
    }
}