data class DataPenghuhiIsekai(var InputName: String, var InputAge: Int)

fun main(){

    // part 1
    val Shiro = DataPenghuhiIsekai("Shiro Neko", 17)
    var (InputName, InputAge) = Shiro

    println("Data Nama : ${InputName}")
    println("Data Umur : ${InputAge}")
    println()
    
    // part 2
    val kuro = DataPenghuhiIsekai("Kuro", 18)
    InputName = kuro.component1()
    InputAge = kuro.component2()
    
    println("Data Nama : ${InputName}")
    println("Data Umur : ${InputAge}")
    println()
    
}