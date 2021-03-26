package one.digitalinnovation.digitalonebank

class Cliente(
        nome: String,
        cpf: String,
        val clienteTipo: clienteTipo,
        val senha: String
        ): Pessoa(nome, cpf), Logavel {
    override fun loguin(): Boolean= "123456" == senha

    override fun toString(): String= """
        Nome: $nome
        Cpf: $cpf
        Tipo:  ${clienteTipo.descricao} """.trimIndent()
    }
