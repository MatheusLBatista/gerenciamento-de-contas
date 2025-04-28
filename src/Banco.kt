class Banco (val nome: String, val agencias: MutableList<Agencia>){

    fun adicionarAgencia(agencia: Agencia) {
        agencias.add(agencia);
    }

    fun removerAgencia(agencia: Agencia) {
        agencias.remove(agencia);
    }

    fun obterAgencia(nome: String): Agencia? {
        return agencias.find { it.nome == nome }
    }
}