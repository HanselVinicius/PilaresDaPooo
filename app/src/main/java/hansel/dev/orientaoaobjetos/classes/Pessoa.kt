package hansel.dev.orientaoaobjetos.classes

class Pessoa(val cpf: String,
             val nome: String,
             val dataDeNascimento: String,
             val idade:String
) {
    fun Falar(mensagem:String){
        println("$nome que tem o numero de cpf $cpf e nasceu no dia $dataDeNascimento falou: $mensagem")

    }

}