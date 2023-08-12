class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int // 0 funcionario, 1 gerente, 2 diretor
) {
    fun bonificacao(): Double {
        return when {
            salario.equals(1) -> salario * 0.1
            salario.equals(2) -> salario * 0.2
            else -> salario * 0.3
        }
    }
}