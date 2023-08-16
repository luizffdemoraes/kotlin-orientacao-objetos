class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    // polimorfismo reaproveitar comportamentos
    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.getBonificacao
    }
}