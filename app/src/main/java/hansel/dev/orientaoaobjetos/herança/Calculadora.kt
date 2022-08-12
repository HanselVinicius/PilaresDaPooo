package hansel.dev.orientaoaobjetos.herança

import java.math.BigDecimal
import java.math.RoundingMode

open class Calculadora {

    //Encapsulamento é utilizado para proteger variaveis de poderem ser usadas em qualquer parte do projeto causando erros inesperados

    /*
    public: Padrão no kotlin é publico para ser usado em qualquer parte do programa
    private: Só pode ser usado na classe em que foi criado
    protected: Permite que classes que herdeiras usem os metodos criados, porem ainda sim não é visivel nem utilizavel no "programa principal"
    internal: Não pode ser usado no projeto em que está importado sendo muito útil para criar bibliotecas
     */

    protected var resultado: BigDecimal = BigDecimal.ZERO

    fun subtrair(a: BigDecimal){
        resultado -=a
        mostraResult()
    }

    fun dividir(a: BigDecimal){
        resultado = resultado.divide(a, 8, RoundingMode.HALF_UP)
        mostraResult()
    }

    fun multiplicar(a: BigDecimal)
    {
        resultado *=a
        mostraResult()
    }


    fun somar(a: BigDecimal){
        resultado += a
        mostraResult()
    }

    protected fun mostraResult() {
        return println("O resultado é $resultado")
    }
}