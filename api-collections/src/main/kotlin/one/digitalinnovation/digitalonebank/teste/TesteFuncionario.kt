package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.Funcionario
import one.digitalinnovation.digitalonebank.Pessoa
import java.math.BigDecimal

fun main() {
    val Jether= Pessoa(nome ="Jether Rodrigues",cpf = "123456789")
    //Jether.cpf ="4567"
    //println(Jether)
    println(Jether.nome)
    println(Jether.cpf)
    val joao =Funcionario(nome="Jether Rodrigues",cpf= "123456789",salario= BigDecimal.valueOf( 2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}
