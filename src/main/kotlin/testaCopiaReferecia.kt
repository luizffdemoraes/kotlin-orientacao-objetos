fun testaCopiaReferecia() {


    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
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

    val contaJoao = Conta("Joao", 1002)
    contaJoao.deposita(300.0)
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: $contaJoao.titular")
    println("titular conta maria: $contaMaria.titular")

    println(contaJoao)
    println(contaMaria)

}