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