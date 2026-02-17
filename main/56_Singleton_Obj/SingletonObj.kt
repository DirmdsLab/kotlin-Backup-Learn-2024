// Part 1 
object DramaApaIni {

    val Drama = "MendingTuruSih"

    fun PrintDrama(Input: String): String {

        return Input.uppercase()

    }

    fun OTWIsekai(Input: String){
        println("Kata Kata Terakhir Anda $Input")
    }

}


// Part 2

class KumpulanDrama(var InputTypeDrama: String){

    object DramaRahasi {

        var DramaOrangElitAja = "Haha"
        fun PrintDramaBadut(){
            println("Sebagai Penonton Yang Baik Yaitu Dengan Memberi Tepukan")
        }

        // Malas gw buat contoh sama kek di atas beda posisi ama pemanggilan aja ^_^

    }

}


fun main(){

    // Part 1
    val DramaApalah = DramaApaIni.Drama
    println(DramaApalah)
    println(DramaApaIni.PrintDrama("Gitulah Drama Di Negara Saya:v wkwk"))
    DramaApaIni.OTWIsekai("Mending Pc")
    println()
    
    // Part 2
    println("Cara Ketawa ${KumpulanDrama.DramaRahasi.DramaOrangElitAja}")
    
    var DramaDiSini = KumpulanDrama("Gitulah")
    println(DramaDiSini.InputTypeDrama)

    KumpulanDrama.DramaRahasi.PrintDramaBadut()

}