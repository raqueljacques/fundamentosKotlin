package fundamentos

fun main() {

    //não pode colocar variáveis tipadas como nula
    //var nome : String = null
    // Interrogação torna possível atribuit o valor null
    val nome : String? = "Marcelo"

    println(nome?.length?.toShort())

    //duas exclamações é uma certeza que não estará nulo
    val toShort : Short = nome!!.length.toShort()

    var nome2 : String? = "Gustavo"

    //elvis operator
    var tamanho: Int = nome2?.length ?: 0

    //A lista não pode ser nula, mas podem ter valores nulos nela
    var lista : List<Int?> = listOf(1, 2, 3, null)

    //A lista pode ser nula e podem ter valores nulos nela
    var listaNula : List<Int?>? = null

}