class Conta (val numeroConta: String, cliente: Cliente){
    private var saldo: Double = 0.0;

    public fun depositar(valor: Double){
        if (valor > 0){
            saldo += valor;
        }
        else {
            println("Informe um valor positivo.")
        }
    }

    public fun sacar(valor: Double){
        if (valor <= saldo) {
            saldo -= valor;
        }
        else{
            println("Valor inserido maior do que o saldo da conta. Tente novamente.")
        }
    }

    public fun obterSaldo(): Double{
        return saldo;
    }
}