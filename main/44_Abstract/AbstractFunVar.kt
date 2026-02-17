abstract class SayaHantu {

    abstract val TypeHantu: String
    abstract fun PrintHantu()

}

class BawaanHantu : SayaHantu() {

    override val TypeHantu = "Loli"
    
    override fun PrintHantu(){
        println("Saya Bawaan Hantu :v")
    }
}

fun main(){

    val Ghost = BawaanHantu()

    println(Ghost.TypeHantu)
    Ghost.PrintHantu()

}