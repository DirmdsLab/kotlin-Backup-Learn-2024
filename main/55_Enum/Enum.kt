enum class MendingTuruBang {

    PAGI, SIANG, SORE, MALAM

}

enum class Part2Turu (val Input: String, val Output: String){

    SIANG("Siang","Hmph"),
    MALAM("Malam","Shiranai");

    fun PrintData(){
        println("Saya Tim : ${Input}")
    }

    fun PrintOutput(){
        println("Code Gabut :v : ${Output}")
    }

}

// Ngulang Dikit

enum class IsekaiApaItu(val Input: String){

    Truck("Truk Kun"),
    Tracktor("Tracktor Kun");

    fun PrintData(){
        println("Saya Dengan : $Input")
    }

}

fun main(){

    var MendingTuru = MendingTuruBang.SIANG
    println(MendingTuru)

    var MendingTuruP2 = MendingTuruBang.SORE
    println(MendingTuruP2)
    println()

    var MendingArray: Array<MendingTuruBang> = MendingTuruBang.values()
    
    for (i in MendingArray){
        println(i)
    }

    println("\nPart 2\n")

    val TimMana = Part2Turu.SIANG
    println(TimMana)
    println()
    TimMana.PrintData()
    TimMana.PrintOutput()

    println("\nPart 3\n")

    val MasukIsekaiOTW = IsekaiApaItu.Truck
    println(MasukIsekaiOTW)
    MasukIsekaiOTW.PrintData()

    // Dahlah Kemana Mana :v 

}
