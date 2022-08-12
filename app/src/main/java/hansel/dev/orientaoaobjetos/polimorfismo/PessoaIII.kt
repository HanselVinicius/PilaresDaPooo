package hansel.dev.orientaoaobjetos.polimorfismo


import java.time.LocalDate

class PessoaIII(val cpf:String,
               val Nome:String,
               val dtNascimento: LocalDate,
               val idade:String
) {
    val animaisAdotados = mutableListOf<AnimalII>()
    var email = ""
        set(value) {
            if (!Regex("([A-Z])\\w+").matches(value)) {
                throw Exception("OPS!, ERRO")
            }
            field = value
        }


    fun falar(mensagem: String) {
        println("$Nome que nasceu no dia $dtNascimento e tem $idade anos de idade falou $mensagem")

    }

    fun adotar(animal: AnimalII) {
        animaisAdotados.add(animal)
    }
}