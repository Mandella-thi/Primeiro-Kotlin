package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.Funcionario
import one.digitalinnovation.digitalonebank.Gerente

fun main() {

    val maria =Gerente(nome="Maria do Carmo",cpf= "123456789",salario=  5000.0, senha="senha 123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}