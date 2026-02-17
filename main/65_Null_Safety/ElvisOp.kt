data class DataTeman(var InputName: String)

fun SapaTeman(InputObj: DataTeman?){

    val NamaTeman = InputObj?.InputName ?: "Puhhh"
    println("Hai ${NamaTeman}")

}


fun main(){

    var Shiro : DataTeman? = null
    SapaTeman(Shiro)

    var Kuro = DataTeman("Kuro")
    SapaTeman(Kuro)

    

}