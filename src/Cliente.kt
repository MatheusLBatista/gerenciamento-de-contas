class Cliente(var nome: String, var endereco: String, val idCliente: String){
    public fun obterNome(): String{
        return nome;
    }

    private fun definirEndereco(novoEndereco: String){
        endereco = novoEndereco;
    }
}


