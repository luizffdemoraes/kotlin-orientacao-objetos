class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double,
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {


    override val bonificacao: Double
        get() {
            println("bonificação diretor")
            return salario + plr
        }

    // override fun auteticavel(senha: Int): Boolean = super<Autenticavel>.autentica(senha)
}