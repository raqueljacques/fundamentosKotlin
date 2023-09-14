package fundamentos

fun main() {
    parOuImpar(2)
    parOuImpar(3)
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }
}