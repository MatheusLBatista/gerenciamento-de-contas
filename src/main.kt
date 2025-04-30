fun main() {
    val cliente1 = Cliente("João Pereira", "Avenida Major Amarante, 1122", "01")
    val conta1 = Conta("1231", cliente1)
    val agencia1 = Agencia("Sicoob")
    val banco = Banco("Banco Sicoob Credisul")
    val transacao1 = Transacao("0001", 350.0, "2024-04-28")

    agencia1.adicionarConta(conta1)
    banco.adicionarAgencia(agencia1)

    val agenciaBuscada = banco.obterAgencia("Sicoob")
    val contaBuscada = agencia1.obterConta("1231")

    conta1.depositar(450.0)
    conta1.sacar(120.0)

    println("Saldo de ${conta1.cliente.nome}: R$ ${conta1.obterSaldo()}")
    println("Agência: ${agenciaBuscada?.nome}")

    if (transacao1.executar()) {
        println("Transação ${transacao1.idtransacao} executada. Valor de R$ ${transacao1.valor}")
    }

    if (contaBuscada != null) {
        println("Conta: ${contaBuscada.numeroConta}, Cliente: ${contaBuscada.cliente.nome}")
    } else {
        println("Conta não encontrada.")
    }
}
