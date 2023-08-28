class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        when {
            this.senha == senha -> {
                println("Bem vindo ao Bytebank")
                true
            }

            this.senha != senha -> println("Falha na autenticação")
        }
    }
}