package hansel.dev.orientaoaobjetos.encapsulamento

import java.math.BigDecimal

//Encapsulamento é utilizado para proteger variaveis de poderem ser usadas em qualquer parte do projeto causando erros inesperados

/*
public: Padrão no kotlin é publico para ser usado em qualquer parte do programa
private: Só pode ser usado na classe em que foi criado
protected: Permite que classes que herdeiras usem os metodos criados, porem ainda sim não é visivel nem utilizavel no "programa principal"
internal: Não pode ser usado no projeto em que está importado sendo muito útil para criar bibliotecas
 */

class Application {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
        val calculadora = Calculadora()
            calculadora.somar(BigDecimal("20"))
            calculadora.dividir(BigDecimal("50"))


        }

    }
}