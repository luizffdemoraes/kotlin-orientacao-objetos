fun main() {
    println("Bem vindo ao Bytebank!")

    var i = 0
    while(i < 5) {

        val titular: String = "Alex $i"
        val numeroConta: Int = 1000
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo $saldo")
        println()
        i++
    }

    // For loop
    /*
    for (i in 5 downTo 1) {

        if(i == 4) {
            break
        }

        val titular: String = "Alex $i"
        val numeroConta: Int = 1000
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo $saldo")
    }
     */

    // testeCondicoes(saldo)
}

fun testeCondicoes(saldo: Double) {
    // Estrutura condicional equivalentes 'if' e 'when'
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}