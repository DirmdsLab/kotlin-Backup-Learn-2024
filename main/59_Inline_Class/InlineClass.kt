// inline class NekoParaler(val Input: String){
//     fun Perbesar(): String = Input.uppercase()
// }

// Kata Nya inline tidak di gunakan lagi gunakan value

@JvmInline
value class NekoParaler(val Input: String){
    fun Perbesar(): String = Input.uppercase()
}

fun main(){

    val Shiro = NekoParaler("Shiro Neko")
    println(Shiro.Perbesar())

}