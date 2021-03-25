package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.Banco

fun main(){
    val digiOneBank = Banco( nome="DigiOne", numero= 12)

  println(digiOneBank.nome)
    println(digiOneBank.numero)

    val Banco2 =digiOneBank.copy(nome= "banco2")
    println(Banco2.info())
}