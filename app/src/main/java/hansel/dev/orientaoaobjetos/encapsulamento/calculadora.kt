package hansel.dev.orientaoaobjetos.encapsulamento

import java.math.BigDecimal
import java.math.RoundingMode

class Calculadora {



    private var resultado: BigDecimal = BigDecimal.ZERO

    fun subtrair(a:BigDecimal){
        resultado -=a
        mostraResult()
    }

    fun dividir(a:BigDecimal){
        resultado = resultado.divide(a, 8, RoundingMode.HALF_UP)
        mostraResult()
    }

    fun multiplicar(a: BigDecimal)
    {
        resultado *=a
        mostraResult()
    }


    fun somar(a:BigDecimal){
        resultado += a
        mostraResult()
    }

    private fun mostraResult() {
        return println("O resultado é $resultado")
    }
}