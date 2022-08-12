package hansel.dev.orientaoaobjetos.herançaII

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class Application {
    companion object{
        @RequiresApi(Build.VERSION_CODES.O)
        @JvmStatic
        fun main(args: Array<String>){
            val  Fernando = PessoaII("123456789-10","Fernando", LocalDate.of(1999,7,
                9), "20" )
             //Fernando.email = "hanelvinicius@gmail.com"
             //Fernando.falar("OI")
            Fernando.adotar(Cachorro())
            Fernando.adotar(Gato())
            Fernando.adotar(Mamifero())
            Fernando.adotar(Peixe())

            for (animal in Fernando.animaisAdotados) {
              /*  when {
                    /*animal is Mamifero -> println("É um mamifero"):::: É interessante notar que caso essa linha de codigo fosse feita assim
                    sem validação previa alguma o resto dos animais que fosse mamiferos não apareceriam pois os mesmos são visto de forma generica como mamiferos pois herdam da classe mamifero
                    */
                    animal is Cachorro -> println("É um cachorro")
                    animal is Gato -> println("É um gato")
                    animal is Mamifero -> println("É um mamifero")
                    animal is Peixe -> println("É um peixe")
                */

                //esta foi uma maneira inteligente que kotlin no permite fazer um CAST de nossas classes porém a uma maneira forçada de fazer os mesmos utilizando o null safe do kotlin
                // (animal as Gato).miar() desta maneira irá ser imprimido um erro pois nem todos os animais é um gato portanto nem todos os animais miam
                (animal as? Gato)?.miar()
                (animal as? Cachorro)?.latir()




            }
            }


        }
    }
