package hansel.dev.orientaoaobjetos.herançaII

import java.time.LocalDate

class PessoaII(val cpf:String,
             val Nome:String,
             val dtNascimento: LocalDate,
             val idade:String
) {
    val animaisAdotados = mutableListOf<Animal>()
    var email = ""
        set(value){
            if (!Regex("([A-Z])\\w+").matches(value)){
                throw Exception("OPS!, ERRO")
            }
            field = value
        }



    fun falar(mensagem:String){
        println("$Nome que nasceu no dia $dtNascimento e tem $idade anos de idade falou $mensagem")

    }
    fun adotar(animal: Animal){
        animaisAdotados.add(animal)
    }

    /*
    é importante para a linha de codigo acima ter em mente a noção do "É um?"
    que é nada mais que pensar da seguinte forma
    animal é um cachorro? a reposta é não animal é qualquer tipo de animal
    mas cachorro é um animal? sim cachorro faz parte dos animais
    e o mesmo para o gato
    porém peixe é um mamifero? não peixe é um animal
    e isso se reflete observando que peixe  não herda a classe mamifero mas gato e cachorro herdam essas classes

    esse pensamento em especifico nos ajuda a trabalhar com heranças
     */

};
