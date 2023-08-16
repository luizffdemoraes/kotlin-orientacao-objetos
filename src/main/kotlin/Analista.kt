class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    fun bonificacao(): Double {
        println("bonificação analista")
        return 1000 + salario
    }
}