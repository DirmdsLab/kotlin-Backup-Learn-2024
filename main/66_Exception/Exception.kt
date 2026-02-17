class TangkapEror(Pesan: String) : Throwable(Pesan)

fun PrintDataVal(Input: String) {

    if (Input.isBlank()){
        throw TangkapEror("Sini Eror Bang :v")
    }

    println("Hai $Input")

}

fun main(){

    var Shiro = "Shiro Neko"
    PrintDataVal(Shiro)
    println()
    
    var Kuro = ""
    PrintDataVal(Kuro)
    println()
    
    var HuuuKagakDiAjak = "Dahlah :v"
    PrintDataVal(HuuuKagakDiAjak)
    println()
    
}