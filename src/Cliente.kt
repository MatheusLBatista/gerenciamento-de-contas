class Cliente(val nome: String, var endereco: String, val idCliente: String){
    public fun obterNome(): String{
        return nome;
    }

    public fun definirEndereco(novoEndereco: String){
        endereco = novoEndereco;
    }
}


