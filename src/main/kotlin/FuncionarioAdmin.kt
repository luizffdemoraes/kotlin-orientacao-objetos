abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun autentica(senha: Int) {
        when {
            this.senha == senha -> {
                println("Bem vindo ao Bytebank")
                true
            }

            this.senha != senha -> println("Falha na autenticação")
        }
    }

    // open fun getBonificacao(): Double = salario * 0.1
    // abstract val getBonificacao: Double
    /*
    get() {
        println("bonificação funcionário")
        return salario * 0.1
    }
     */
}