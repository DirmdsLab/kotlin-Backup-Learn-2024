class Mouse(val Input: String)
class Keybord(val Input: String){

    override fun toString(): String{

        return "Keybord Biasa"

    }

    fun OriginalToString(): String{
        return super.toString()
    }

}


fun main(){

    val Logitech = Mouse("Logitech")
    
    println(Logitech)
    println(Logitech.toString())
    println()

    val RedDragon = Keybord("RedDragon")

    println(RedDragon)
    println(RedDragon.toString())
    println(RedDragon.OriginalToString())

}