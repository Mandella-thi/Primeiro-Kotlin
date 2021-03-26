package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.clienteTipo

fun main() {
    clienteTipo.values().forEach { elemento ->
    println(" ${elemento.name} - ${elemento.descricao}")

    }
    clienteTipo.values().forEach {
        println(" ${it.name} - ${it.descricao}")

    }
    val pf =clienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")
    val pj =clienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}
