package Banckdigital

class Pessoa {
    var nome : String="Gilberto"
    var cpf  : String= " 956.143.546-20"

    inner class Endereco {

        var rua : String="rua teste"
    } }

fun main() {

    val Gilberto = Pessoa()

    println(Gilberto.nome)
    println(Gilberto.cpf)
    println(Gilberto.Endereco().rua)
}
