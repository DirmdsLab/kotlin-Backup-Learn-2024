// Tampa This 

class NamePetV2(val NamePet: String){

    fun PrintThis(NamePet: String){
        println("Hai $NamePet, Dia Adalah $NamePet")
    }

}

// Dengan This 

class NamePetV3(val NamePet: String){

    fun Println(NamePet: String){
        println("Hai ${this.NamePet}, Dia Adalah $NamePet ")
    }

}

// Hasil Di Atas Kosep Sama Dengan Toturial
// Konsep This Sendiri

class DataPet(val NamePet: String, val AgePet: Int, val Type: String){
    
    fun PrintPet(){
        println("Name : ${this.NamePet}\nAge  : ${this.AgePet}\nType : ${this.Type}")
    }

}

fun main(){

    var Hikari = NamePetV2("Hikari")
    var Shiro = NamePetV3("Shiro")

    Hikari.PrintThis("Hikari")
    Shiro.Println("Shiro")

    println()

    var ShiroNeko = DataPet("Shiro", 3, "Neko")

    ShiroNeko.PrintPet()

}