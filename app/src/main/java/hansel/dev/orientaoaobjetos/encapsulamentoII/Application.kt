package hansel.dev.orientaoaobjetos.encapsulamentoII

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

/*
getters and setter são importantissimos em java para proteger seus dados uma vez que os getters retorna valores
e setter atualiza eles ou os define, porém em kotlin getters quase não são utilizados mas o setter sim porque podem
adcionar condições a certo valor
 */


class Application {
    companion object{
        @RequiresApi(Build.VERSION_CODES.O)
        @JvmStatic
        fun main(args: Array<String>){
          val  Fernando = Pessoa("123456789-10","Fernando", LocalDate.of(1999,7,9), "20" )
            Fernando.email = "hanelvinicius@gmail.com"
            Fernando.falar("OI")
        }
    }
}