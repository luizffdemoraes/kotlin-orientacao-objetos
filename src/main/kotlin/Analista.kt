class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
        println("bonificação analista")
        return salario * 0.1
    }
}