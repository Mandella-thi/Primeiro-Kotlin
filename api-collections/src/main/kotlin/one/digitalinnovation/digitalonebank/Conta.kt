package one.digitalinnovation.digitalonebank

import java.math.BigDecimal

class Conta( //construtor
    val agencia: String //propriedades
    val numero: String
    val saldo: BigDecimal
    ){
    fun deposito(valor: BigDecimal){}

    fun saque(valor: BigDecimal)

}
