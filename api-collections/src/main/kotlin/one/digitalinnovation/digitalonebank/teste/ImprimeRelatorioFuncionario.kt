package one.digitalinnovation.digitalonebank.teste

import one.digitalinnovation.digitalonebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                    funcionario.toString()
            )
        }
    }
}