package fundamentos

fun retornaNumeroPorExtenso(numero: Int): String {
    if (numero == 5) {
        return "cinco"
    } else if (numero == 6) {
        return "seis"
    }
    return "Numero não mapeado"
}

fun main() {
    println(retornaNumeroPorExtenso(5))
}