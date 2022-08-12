package hansel.dev.orientaoaobjetos.polimorfismo

class GatoII: MamiferoII() {
    fun miar(){
        println("miau")
    }

    override fun comunicar() {
        miar()
    }

}