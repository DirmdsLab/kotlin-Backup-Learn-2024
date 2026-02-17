interface AduMie {

    var BrandMie1: String
    var BrandMie2: String

}

interface NgajakGeludTimMieSedap {

    fun Mie(){

        println("Mie Ya Indomie Lah")

    }

}

interface NgajakGeludTimIndomie {

    fun Mie(){

        println("Mie Ya Mie Sedap Lah")

    }

}



class MendangMending(override var BrandMie1: String, override var BrandMie2: String) : AduMie, NgajakGeludTimMieSedap, NgajakGeludTimIndomie {


    override fun Mie(){

        super<NgajakGeludTimIndomie>.Mie()
        super<NgajakGeludTimMieSedap>.Mie()
        println("Mending Damai :v")

    }


}


fun main(){

    var TimMana = MendangMending("Mie Sedap", "Indomie")
    TimMana.Mie()

}