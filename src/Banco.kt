class Banco (private var nome: String){
    private val agencias = mutableListOf<Agencia>()

    public fun adicionarAgencia(agencia: Agencia) {
        agencias.add(agencia);
    }

    public fun removerAgencia(agencia: Agencia) {
        agencias.remove(agencia);
    }

    public fun obterAgencia(nome: String): Agencia? {
        return agencias.find { it.nome == nome }
    }
}