package hansel.dev.orientaoaobjetos.polimorfismo

class CachorroII: MamiferoII() {

    fun latir(){
        println("auau")
    }

    override fun comunicar() {
        /* super.comunicar()
           ao chamarmos uma override function o super é chamado que serve para referenciar nossa classe pai portanto podemos
           ver que o polimorfismo trabalha também com complemento de metodos não só com alterações
           */
        latir()

    }





}