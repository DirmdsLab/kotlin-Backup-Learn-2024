data class KandidatRajaIblis(var InputLord: String)

fun TheRealLord(InputObj: KandidatRajaIblis?) {

    println("Hai Lord ${InputObj?.InputLord}")

}

fun main(){

    // Valid Raja
    var Shadow = KandidatRajaIblis("Lord Shadow")
    TheRealLord(Shadow)

    // Kagak Valid
    var Slime : KandidatRajaIblis? = null
    TheRealLord(Slime)

    // Dah Gitu Aja Jadi Safe Kan :v 


}