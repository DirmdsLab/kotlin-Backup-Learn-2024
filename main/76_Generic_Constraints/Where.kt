interface LordShiro {
    fun PrintLord(Input: String): Unit
}


open class ShiroOpen

class ShiroClose : ShiroOpen()

class ShiroOtwP2 : ShiroOpen(), LordShiro {

    override fun PrintLord(Input: String){
        println("Hai ${Input}")
    }

}

class PanggilKeIsekai <T>(val Input: T) where T: ShiroOpen, T: LordShiro


fun main(){

    // Eror
    // val ShiroNekoP1 = PanggilKeIsekai(ShiroClose) 

    // Yang Work
    val ShiroNeko = PanggilKeIsekai(ShiroOtwP2())

    // val ShiroNekoP2 = PanggilKeIsekai("Eror")


    // Sedang Malas :v
    // println(ShiroNeko)
    // println(ShiroNeko.ShiroOtwP2.PrintLord)

    // pura pura kagak liat dulu 
}