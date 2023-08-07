fun main() {
    println("Bem vindo ao Bytebank!")
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo = 0.0


    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo $saldo")

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