package fundamentos

fun main() {
    printa1a10()
}

fun printa1a10 () {
    for (numero in 1 ..10) {
        println(numero)
    }
}

fun printa10a1() {
    for(numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaPar1a10() {
    for(numero in 2 .. 10 step 2) {
        println(numero)
    }
}

fun printaRange(inicio: Int, fim: Int) {
    for(numero in inicio .. fim) {
        println(numero)
    }
}

fun whileMenorQue10() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

//vai fazer o que tem no do a primeira vez sem ferificar a condição do while
fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}