fun main() {

    var nome: String
    var idade: Int

    println("Digite seu nome: ")
    nome = readLine()!!

    println("Digite sua idade: ")
    idade = readLine()!!.toInt()

    println("O seu nome é $nome e sua idade é $idade anos.")
}