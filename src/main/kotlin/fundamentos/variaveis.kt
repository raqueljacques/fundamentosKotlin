package fundamentos

fun main() {
    //mutavel
    var nome = "Gustavo"
    //Imutável
    val nomeVal = "Gustavo"

    nome = "Daniel"
    //nomeVal = "Daniel"

    val idade = 24
    println(idade)
}

class variaveis {
    var teste: String = "teste"
    //late init quer dizer que vamos iniciar ela depois, log tem que ser var
    lateinit var teste2: String

    fun iniciaVarioaveis() {
        teste = "Teste"
    }

}