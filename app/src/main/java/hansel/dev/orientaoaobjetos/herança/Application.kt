package hansel.dev.orientaoaobjetos.herança

import hansel.dev.orientaoaobjetos.encapsulamento.Calculadora
import java.math.BigDecimal

/*
herança é um pilar importantissimo da POO pois pode adcionar metodos e caracteristicas a uma classe existente sem alterar a mesma
 */



class Application {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal("20"))
            /*calculadora.potencia(8)
              podemos ver um erro no potencia isso acontece porque somente a classe CalculadoraCientifica possui esse metodo
              e herda as caracteristicas de calculadora e não ao contrario!
            */
            val CalculadoraCientifica = CalculadoraCientifica()
            CalculadoraCientifica.somar(BigDecimal("2"))
            CalculadoraCientifica.potencia(8)

        }

    }
}