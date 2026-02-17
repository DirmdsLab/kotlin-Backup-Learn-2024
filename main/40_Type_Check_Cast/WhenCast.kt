class PortabelConsole(val Brand: String)
class Console(val Brand: String)

fun PrintAnyWhen(any: Any){

    // println(any.Brand)
    // kagak bisa karena belum di cast 

    when (any){
        
        is PortabelConsole -> println("Portabel : ${any.Brand}")
        is Console -> println("Console  : ${any.Brand}")
        else -> println(any)

    }

}

fun main(){

    val SteamDeck = PortabelConsole("Steam")
    val Xbox = Console("Microsoft")

    PrintAnyWhen(SteamDeck)
    PrintAnyWhen(Xbox)
    PrintAnyWhen("PlayStation")

}