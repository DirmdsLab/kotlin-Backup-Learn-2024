class NamePet(var InputPet: String, var InputAgePet: Int? = null, var InputPetType: String ){

    // Hmm

}

fun main(){
    var Hikari = NamePet("Hikari",3,"Neko")
    var Shiro = NamePet(InputPetType = "Inu",InputPet = "Shiro")

    println("Name : ${Hikari.InputPet}\nAge  : ${Hikari.InputAgePet}\nType : ${Hikari.InputPetType}\n")
    println("Name : ${Shiro.InputPet}\nAge  : ${Shiro.InputAgePet}\nType : ${Shiro.InputPetType}\n")
    
    // Simple Aja

}