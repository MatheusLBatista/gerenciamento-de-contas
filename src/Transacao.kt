//import java.util.Date

class Transacao (public val idtransacao: String, public val valor: Double, public val data: String) {

    fun executar(): Boolean{
        return true;
    }
}