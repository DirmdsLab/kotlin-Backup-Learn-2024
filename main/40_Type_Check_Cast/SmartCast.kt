package console.umaru

class PortabelConsole(val Brand: String)
class Console(val Brand: String)

fun PrintAny(any: Any){
    println("Type Data : $any \nType : ${any::class.simpleName}\n")

    // println("${any.Brand}")
    // Kagak Bisa di pakai sebelum di cast

    if (any is PortabelConsole){
        println("Portabel : ${any.Brand}")
    } else if(any is Console){
        println("Console  : ${any.Brand}")
    } else {
        println(any)
    }

    println("Type Data : $any \nType : ${any::class.simpleName}\n")


}

fun main(){

    val ConsolePs = Console("Sony")
    val Nitendo = PortabelConsole("NitendoSwith")
    
    println("\nType Data : ${ConsolePs.Brand}\nType : ${ConsolePs::class.simpleName}\n")
    
    PrintAny("Ps")
    PrintAny(ConsolePs)
    PrintAny(Nitendo)


    // Silakan Dipahami :v

}