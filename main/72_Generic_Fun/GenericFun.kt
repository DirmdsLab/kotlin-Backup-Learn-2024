class IsekaiBroGas(val InputUser: String){

    fun <T> PrintDataGas(SpecialInput: T){
        println("Hai ${SpecialInput} Dengan Username ${InputUser}")
    }

}

fun main(){

    val Shiro = IsekaiBroGas("Shiro")

    // Kek Biasa Aja
    Shiro.PrintDataGas("Mooo")
    Shiro.PrintDataGas<String>("Shiranai Baka")

    // Kek Biasa Part 2
    Shiro.PrintDataGas(17)
    Shiro.PrintDataGas<Int>(17)

    // Gitulah Simple Bukan :v

}