fun main() {
    println("Bem vindo ao Bytebank!")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    contaJoao.numero = 1002
    contaJoao.saldo = 300.0
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: $contaJoao.titular")
    println("titular conta maria: $contaMaria.titular")

    println(contaJoao)
    println(contaMaria)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
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