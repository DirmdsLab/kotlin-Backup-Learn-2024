class AgePet(var InputAge: Int){

    fun PrintNamePet(InputName: String){
        println("Name Pet : $InputName\nAge      : $InputAge")
    }

    fun PrintNamePet(InputName: String, InputType: String){
        println("Name Pet : $InputName\nType     : $InputType\nAge      : $InputAge")
    }

    // Space Agak Kacau Tapi Supaya Estetik Aja Di Console :v

}

fun main(){
    
    var Hikari = AgePet(2)
    Hikari.PrintNamePet("Hikari")
    println()
    Hikari.PrintNamePet("Hikari", "Neko")

    println()

    var ShiroNeko = AgePet(17)
    ShiroNeko.PrintNamePet("Shiro Neko")
    println()
    ShiroNeko.PrintNamePet("Shiro Neko", "Neko?")

}
