fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    /*
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.getSaldo())

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.deposita(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.deposita(100.0)
    println(contaFran.saldo)

    println("saca em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saca em excesso na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if(contaFran.transfere(300.0, contaAlex)){
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
     */
}


class Conta(var titular: String,var numero: Int) {
    var saldo = 0.0
       private set

    /*
    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }
     */

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

    /*
    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double){
        if(valor > 0){
            saldo = valor
        }
    }
     */
}

/*
fun testaCopiasEReferencias() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.deposita(200.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.deposita(300.0)

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
    contaJoao.deposita(300.0)
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: $contaJoao.titular")
    println("titular conta maria: $contaMaria.titular")

    println(contaJoao)
    println(contaMaria)
}
 */

fun testaLacos() {
    var i = 0
    while (i < 5) {

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