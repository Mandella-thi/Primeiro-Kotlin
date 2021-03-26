package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.Cliente
import one.digitalinnovation.digitalonebank.clienteTipo

fun main() {
    val jose = Cliente(
                nome = "jose da Silva",
                cpf = "123.456.456-77",
                clienteTipo = clienteTipo.PF,
                senha = "123456"
        )
    println(jose)

    TesteAutenticacao().autentica(jose)
    }

