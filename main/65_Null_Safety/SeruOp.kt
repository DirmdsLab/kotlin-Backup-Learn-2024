data class SayaSukaNull(var Input: String)

fun PanggilNull(InputObj: SayaSukaNull?){

    println(InputObj!!.Input) 
    // println(InputObj?.Input)
    // mending code ke 2 lebih aman 

}


fun main(){

    val Shiro = SayaSukaNull("Shiro")
    PanggilNull(Shiro)

    var Kuro : SayaSukaNull? = null
    PanggilNull(Kuro)


}