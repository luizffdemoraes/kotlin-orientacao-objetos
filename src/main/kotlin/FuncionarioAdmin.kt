abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: Int,
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        println("autentica funcionário admin")
        if (this.senha == senha) {
            true
        }
        return false
    }
}