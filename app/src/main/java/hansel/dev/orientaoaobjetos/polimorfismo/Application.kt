package hansel.dev.orientaoaobjetos.polimorfismo

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate


/*
polimorfismo se trata de deixar as classes filhas ter uma certa autonomia para poder alterar comportamentos herdados da
classe pai

 */

class Application {
    companion object {
        @RequiresApi(Build.VERSION_CODES.O)
        @JvmStatic
        fun main(args: Array<String>) {
            val Fernando = PessoaIII(
                "123456789-10", "Fernando", LocalDate.of(
                    1999, 7,
                    9
                ), "20"
            )
            //Fernando.email = "hanelvinicius@gmail.com"
            //Fernando.falar("OI")
            Fernando.adotar(CachorroII())
            Fernando.adotar(GatoII())
            Fernando.adotar(PeixeII())
            Fernando.adotar(MamiferoII())

            for (animal in Fernando.animaisAdotados) {
                animal.comunicar()
                /*
                polimorfismos é essencial para tirar aquele cast demorado e que deixa o codigo dificil de ser lido e alterado
                 */

            }


        }
    }
}