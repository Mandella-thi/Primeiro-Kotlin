package one.digitalinnovation.digitalonebank

class Pessoa {
    var nome: String= "Jether"
    var cpf: String = "125.125.125.11" // private: modificador de visibilidade
    private set//não deixa modificar os dados

    constructor()

    fun pessoaInfo() ="$nome e $cpf"
    /**inner class Endereco{
        var rua: String ="Rua teste"
    }**/
}

fun main(){
    val Jether= Pessoa()
    //Jether.cpf ="4567"
    //println(Jether)
    println(Jether.nome)
    println(Jether.pessoaInfo())
   // println(Jether.Endereco().rua)

}