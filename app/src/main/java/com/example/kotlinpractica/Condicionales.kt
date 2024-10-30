package com.example.kotlinpractica

import kotlin.reflect.typeOf

fun main(){
//    numero_pnc()
//    edadConducir()
//    descuentos()
//    parImpar()
//    calificaciones()
//    numeroMayor()
//    horasExtra()
//    accessoRestringido()
    edadUsuario()
}

//Edad mínima para conducir: Crea un programa que pida la edad de una persona y muestre un mensaje
// indicando si tiene la edad suficiente para conducir (mayor o igual a 18 años).
fun edadConducir(){
    println("Coloca tu edad: ")
    val edad = readLine()?.toIntOrNull()?:0
    if(edad >= 18){
        println("Puedes conducir")
    }else{
        println("No puedes conducir")
    }
}


//Número positivo, negativo o cero: Solicita un número al usuario y determina si es positivo, negativo o cero.
// Muestra un mensaje correspondiente para cada caso.
fun numero_pnc(){
    println("Coloca un numero: ")
    val numero = readLine()?.toIntOrNull()?:0
    if(numero > 0 || numero == 0){
        println("${numero} es positivo")
    }else{
        println("${numero} es negativo")
    }
}


//Descuento en compras: Pregunta el monto de una compra y aplica un
// descuento del 10% si el total es mayor a 1000 unidades monetarias.
// Muestra el total con el descuento aplicado si corresponde.
fun descuentos(){
    println("Cual es el monto de tu compra")
    val valorCompra = readLine()?.toIntOrNull()?:0
    //numero por porcentaje entre 100
    if(valorCompra > 1000){
        val descuento = (valorCompra * 10) / 100
        val resultadoFinal = valorCompra - descuento
        println("El total es ${valorCompra}, con un descuento de $${descuento}. PRECIO FINAL ${resultadoFinal}")
    }else{
        println("Lo siento el valor de compra tiene que ser mayor a 1000")
    }
}


//Número par o impar: Pide un número entero al usuario e indica si es par o impar.
fun parImpar(){
    println("Ingresa un numero: ")
    val numero = readLine()?.toIntOrNull()?:0
    if(numero % 2 == 0){
        println("Tu numero ${numero} es par")
    }else{
        println("Tu numero ${numero} es impar")
    }
}


//Calificación aprobatoria: Solicita una calificación al usuario y muestra un
// mensaje de "Aprobado" si la calificación es mayor o igual a 6, y "Reprobado" si es menor.

fun calificaciones(){
    println("Dame tu calificacion: ")
    val calificacion = readLine()?.toIntOrNull()?:0
    if (calificacion >= 6){
        println("Aprobado")
    }else{
        println("Reprobado")
    }
}

//Número mayor entre dos: Pide dos números y muestra cuál de los dos es mayor. Si son iguales, indícalo.
fun numeroMayor(){
    println("Ingresa dos numeros y comprueba cual es el mayor ")
    val n1 = readLine()?.toIntOrNull()?:0
    val n2 = readLine()?.toIntOrNull()?:0

    if(n1 > n2){
        println("${n1} es el numero mayor")
    }else if(n1 == n2){
        println("${n1} y ${n2} son numeros iguales")
    }else{
        println("${n2} es el numero mayor")
    }
}

//Bono de horas extras: Crea un programa que solicite las horas trabajadas en una semana.
// Si el número es mayor a 40, muestra un mensaje indicando que el usuario recibirá un bono.

fun horasExtra(){
    println("Ingresa las horas trabajadas en este semana")
    val horas = readLine()?.toIntOrNull()?:0
    if(horas > 40){
        println("Recibiras un bono")
    }
}


//Acceso restringido: Pide un nombre de usuario y una contraseña.
// Si ambos coinciden con valores predefinidos (por ejemplo, "admin" y "1234"),
// muestra un mensaje de "Acceso concedido"; de lo contrario, muestra "Acceso denegado".
fun accessoRestringido(){
    println("Ingresa tu usuario")
    val usuario = readLine()
    println("Ingresa tu contraseña")
    val contraseña = readLine()
    if(usuario == "admin" && contraseña == "1234"){
        println("Acceso concedido")
    }else{
        println("Acceso denegado")
    }
}



//Validación de rango: Solicita un número entre 1 y 100. Si el número está fuera de este rango,
// muestra un mensaje de error.
fun rango(){
    println("Escribe un numero del 1 al 100")
    val numero = readLine()?.toIntOrNull()?:0
    if(numero >=1 && numero <= 100){
        println("${numero} se encuentra dentro del rango 1 y 100")
    }else{
        println("Error")
    }
}


//Categoría por edad: Pide la edad del usuario y muestra en qué categoría se encuentra: Niño (0-12),
// Adolescente (13-17), Adulto (18-64) o Adulto Mayor (65+).
fun edadUsuario(){
    println("Escribe la edad del usuario")
    val edad = readLine()?.toIntOrNull()?:0
    if(edad>=0 && edad<=12){
        println("Niño")
    }else if (edad>=13 && edad<= 17){
        println("Adolescente")
    }else if(edad >=18 && edad<=64){
        println("Adulto")
    }else if(edad >= 65){
        println("Adulto Mayor")
    }else{
        println("No se pueden ingresar negativos")
    }
}