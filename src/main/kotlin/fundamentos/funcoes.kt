package fundamentos

fun main(): Unit {
    println(retornaNome())
    var nome = retornaNome()
    println(nome)
    dizOi(nome, 21)
}

fun retornaNome(): String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int) {
    println("Oi, ${nome}, parabéns pelos seus ${idade} anos")
}