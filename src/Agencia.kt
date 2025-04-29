open class Agencia (public var nome: String){
    private val contas = mutableListOf<Conta>();


    public fun adicionarConta(conta: Conta) {
        contas.add(conta);
    }

    public fun removerConta(conta: Conta) {
        contas.remove(conta)
    }

    public fun obterConta(numero: String): Conta? {
        return contas.find { it.numeroConta == numero }
    }
}