abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    // open fun getBonificacao(): Double = salario * 0.1
    // abstract val getBonificacao: Double
    /*
    get() {
        println("bonificação funcionário")
        return salario * 0.1
    }
     */
    abstract val bonificacao: Double
}