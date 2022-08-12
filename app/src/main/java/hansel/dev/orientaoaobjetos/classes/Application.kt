package hansel.dev.orientaoaobjetos.classes

/*
classes trabalham muito com abstrações pois são nelas que criamos objetos que são nada mais que
representações do mundo real e por isso precisamos nos focar em dar a elas identidades unicas para não haver
conflitos tanto no programa quanto na nossa mente
 */


class Application {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            val Vinicius = Pessoa("123456789-10","Vinicius","28/04/2002","20")
            Vinicius.Falar("Olá mundo")


        }
    }
}