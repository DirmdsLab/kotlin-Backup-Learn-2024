// Part 1
sealed class JenisNeko(var Input: String)

class Input1 : JenisNeko("Hmph")
class Input2 : JenisNeko("Shiranai")

fun CekNeko(NekoHmph : JenisNeko ): String {
    

    return when (NekoHmph){

        is Input1 -> "Saya Tim Hmph"
        is Input2 -> "Shiranai Mooo Shiranai"

    }


}

fun main(){


    var Shiro = Input1()
    var ShiroP2 = Input2()

    println(Shiro.Input)
    println(ShiroP2.Input)
    println()

    println("Cek Shiro    : ${CekNeko(Shiro)}")
    println("Cek Shiro P2 : ${CekNeko(ShiroP2)}")

}