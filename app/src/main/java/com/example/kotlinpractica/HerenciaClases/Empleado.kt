package com.example.kotlinpractica.HerenciaClases

open class Empleado(val nombre:String, val salario:Int, area:String) {
    open fun salario():Any{
        return "Tu salario es ${salario}"
    }
}

class Gerente(nombre:String, salario: Int, area: String):Empleado(nombre, salario, area){
    //Bono para gerente
    override fun salario(): Any {
        val plus = 200
        val aumento = salario + plus
        return "Tu salario es ${aumento} con un aumento de ${plus}"
    }
}

class Desarrallador(nombre: String, salario: Int, area: String):Empleado(nombre, salario, area){
    //Bono para desarrollador
    override fun salario(): Any {
        val plus = 300
        val aumento = salario + plus
        return "Tu salario es ${aumento} con un aumento de ${plus}"
    }
}

class Diseñador(nombre: String, salario: Int, area: String):Empleado(nombre, salario, area){
    // Bono para Diseñador
    override fun salario(): Any {
        val plus = 100
        val aumento = salario + plus
        return "Tu salario es ${aumento} con un aumento de ${plus}"
    }

    fun herramientasDiseño():List<String>{
        var herramientas = listOf("Figma", "Photoshop")
        return herramientas
    }
}

fun main(){
    //Instancias de clases
    var empleado = Empleado("Luis",2130, "HR")
    var gerente = Gerente("Miguel", 2100, "HR")
    var desarrollador = Desarrallador("Pablo", 1300, "TI")
    var diseñador = Diseñador("Jose", 400, "DP")

    // Metodos de clases
    println(empleado.salario())
    println(gerente.salario())
    println(desarrollador.salario())
    println(diseñador.salario())
    println(diseñador.herramientasDiseño())
}
