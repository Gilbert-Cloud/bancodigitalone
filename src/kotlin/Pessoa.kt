package Banckdigital

class Pessoa {
    var nome: String = "Gilberto"
    var cpf: String = " 956.143.546-20"
        private set

    constructor()

    fun pessoainfo() = "$nome + $cpf "
}
fun main() {

    val Gilberto = Pessoa()

    println(Gilberto.nome)
    println(Gilberto.cpf)
    println(Gilberto.pessoainfo())
}
