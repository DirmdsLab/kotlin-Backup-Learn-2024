class Neko(val Input: String)
class Inu(val Input: String) 


fun PrintNekoIs(any: Any){

    when(any){

        is Neko -> println("${any.Input}")
        else -> println("Hmph")

    }

}

fun PrintNekoNotIs(any: Any){

    when(any){

        !is Neko -> println("Hmph Shiranai")
        else -> println("Hmm : $any")

    }

}


fun main(){

    val ShiroNeko = Neko("ShiroNeko")
    val KuroInu = Inu("KuroInu")


    PrintNekoIs(ShiroNeko)

    PrintNekoNotIs(ShiroNeko)
    
    PrintNekoIs(KuroInu)

    PrintNekoNotIs(KuroInu)


}
