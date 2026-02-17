class KoreNeko(var Input: String){

    var Neko: String = Input
        get() = field
        set(Value){

            if(Value.isNotBlank()){
                field = Value
            }

        }

    var NekoBig: String = Input
        get() = Input.uppercase()
    
    var NekoSet: String = Input
        set(Value){
            field = Value.lowercase()
        }

}

fun main(){

    var ThisIsNeko = KoreNeko("Shiro Neko")

    println(ThisIsNeko.Input)
    println(ThisIsNeko.Neko)
    
    ThisIsNeko.Neko = "Kuro Neko"
    println(ThisIsNeko.Neko)
    
    ThisIsNeko.Neko = ""
    println(ThisIsNeko.Neko)
    
    println()
    
    println(ThisIsNeko.NekoBig)

    println()

    println(ThisIsNeko.NekoSet)

}