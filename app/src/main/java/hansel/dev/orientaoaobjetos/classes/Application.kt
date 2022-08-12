package hansel.dev.orientaoaobjetos.classes

/*
classes são poderosas e muito uteis no mundo da programação para manter oo codigo limpo e legivel pras demais pessoas que pensam em
ler e melhorar o seu codigo
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