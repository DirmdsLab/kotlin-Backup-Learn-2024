class PetType(val InputType: String){

    fun PrintType(InputNamePet: String): Unit {
        println("Hai $InputNamePet\nType : $InputType")
    }

}

/**
 * Dah lah
 * 
   var Hikari = PetType("Neko")
   Hikari.PrintType("Hikari")
 * Bisa Bisa Lupa Fun :v
 */

 fun main(){

    var Hikari = PetType("Neko")
    Hikari.PrintType("Hikari")

 }
 