data class IsekaiData(var Input: String)

fun CekApakahNull(Input: IsekaiData?){

    if (Input != null){
        println("Hai ${Input.Input}")
    } else {
        println("Kagak Ada Data")
    }

}

fun main(){

    // Valid Valid :v
    var Shiro = IsekaiData("Shiro Neko")
    CekApakahNull(Shiro)

    // Ketika Null
    var Kuro : IsekaiData? = null
    CekApakahNull(Kuro)
    // Dah lanjut Part 2
}   