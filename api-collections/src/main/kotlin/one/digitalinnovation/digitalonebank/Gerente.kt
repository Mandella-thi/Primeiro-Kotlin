package one.digitalinnovation.digitalonebank

class Gerente(nome: String,
              cpf: String,
              salario: Double,
                val senha: String
): Funcionario(nome= nome,cpf=cpf, salario = salario),Logavel {
    override fun calculoAuxilio(): Double = salario*0.4

    override fun loguin(): Boolean = "senha 123"== senha


}