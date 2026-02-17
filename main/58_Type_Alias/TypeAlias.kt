class RajaIblisIsekai {

    init {
        println("Kelas Terbuat")
    }

    val Lord = "Ahahahahah I Am Atomic"

}

typealias Lord = RajaIblisIsekai

// untuk fun

typealias SayaString = () -> String

fun HaiRajaIblis(Input: SayaString){

    println("Hai Lord ${Input()}")

}



fun main(){

    val Shadow = Lord()
    println(Shadow.Lord)

    HaiRajaIblis { "Cid" }

}