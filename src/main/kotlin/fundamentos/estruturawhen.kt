package fundamentos

fun main() {
    val x = 5

    //"," é ou
    // .. range
    when(x) {
        5, -5 -> println("cinco")
        8 -> println("oito")
        10 -> {
            println("dez")
            println("é uma dezena")
        }
        in 11..15 -> println("x está entre 11 e 15")
        !in 16..20 -> println("NUmero não está no range de 16 a 20")
        else -> println("Numero não mapeado")
    }
    when {
        comecaComOi(5) -> println("5")
        comecaComOi("Oi, estou bem") -> println("oi, estou bem")
    }

}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}