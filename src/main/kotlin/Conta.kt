abstract class Conta(
    var titular: String,
    var numero: Int = 0
) {
    var saldo = 0.0
        protected set

    /*
    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }
     */

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

    /*
    abstract fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }
     */

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