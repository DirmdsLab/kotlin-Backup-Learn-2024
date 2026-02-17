abstract class Huuuuu(val Input: String){

    init{
        println("Saya Kelas Hantuuuuuu :v")
    }

    fun PrintVal(){
        println("Nilai Saya : $Input")
    }

}

class Ghost(val InputUser: String) : Huuuuu(InputUser)

fun main(){

    // val Huuuuuuuuuuuuuuuuu = Huuuuu("Hmm") 
    // Kagak Bisa karena dia itu Hilang :v

    val Huuuuuuuuuuuuuu = Ghost("Huuuuuu Hmph")
    Huuuuuuuuuuuuuu.PrintVal()

}