class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        admin.autentica(senha)
    }
}