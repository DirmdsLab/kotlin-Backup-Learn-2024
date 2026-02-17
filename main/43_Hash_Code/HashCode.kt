class ShiranaiV1(val Input: String)

class ShiranaiV2(val Input: String){

    override fun hashCode(): Int {

        return Input.hashCode()

    }

    fun OriHashCode(): Int{
        return super.hashCode()
    }

}

fun main(){

    // Part 1
    val HmphP1 = ShiranaiV1("Hmph")
    println("Data P1      : ${HmphP1.Input}")
    println("Hash Code P1 : ${HmphP1.hashCode()}\n")

    val HmphP2 = ShiranaiV1("Hmph")
    println("Data P2      : ${HmphP2.Input}")
    println("Hash Code P2 : ${HmphP2.hashCode()}\n")

    println("Bandingkan   : ${HmphP1.hashCode() == HmphP2.hashCode()}")

    println("\nPadahal Stringnya Sama Tapi Outputnya False\n")

    // Part 2
    val HmphP3 = ShiranaiV2("Shiranai")
    println("Data P3      : ${HmphP3.Input}")
    println("Hash Code P3 : ${HmphP3.hashCode()}")
    println("Hash Ori     : ${HmphP3.OriHashCode()}\n")
    
    val HmphP4 = ShiranaiV2("Shiranai")
    println("Data P4      : ${HmphP4.Input}")
    println("Hash Code P4 : ${HmphP4.hashCode()}")
    println("Hash Ori     : ${HmphP4.OriHashCode()}\n")
    
    println("Bandingkan   : ${HmphP3.hashCode() == HmphP4.hashCode()}")
    println("Bandingkan 2 : ${HmphP3.OriHashCode() == HmphP4.OriHashCode()}")

    println("\nGitulah\n")

}