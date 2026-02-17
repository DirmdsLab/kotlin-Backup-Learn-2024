import kotlin.properties.Delegates

class NamaIsekai(InputName: String){

    var InputName: String by Delegates.observable(InputName) { property, oldValue, newValue ->
    
        println("Change Value")
        println("Jenis Value : ${property}")
        println("Old Value   : ${oldValue}")
        println("New Value   : ${newValue}")
        
    }


}



fun main(){

    // print awal 
    val Shiro = NamaIsekai("Shiro Neko")
    println("Part 1")
    println(Shiro.InputName)
    println()
    
    // Perubahan 1
    println("Part 2")
    Shiro.InputName = "Shiro"
    println(Shiro.InputName)
    println()
    
    // Perubahan 2
    println("Part 3")
    Shiro.InputName = "Shiroooooo"
    println(Shiro.InputName)
    println()
    
    // Dah Itu Aja
    
}