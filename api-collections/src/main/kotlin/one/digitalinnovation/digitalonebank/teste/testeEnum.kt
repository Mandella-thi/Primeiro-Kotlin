package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.clienteTipo

fun main() {
    clienteTipo.values().forEach { elemento ->
    println(" ${elemento.name} - $elemento")

    }
    clienteTipo.values().forEach {
        println(" ${it.name} - $it")

    }
}