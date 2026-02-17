fun Name(Name: String) = println("Hai $Name")

fun Kuadrat(Num1: Int): Int = Num1 * Num1

fun main(){
    Name("Umaru")

    val Num1 = 5
    println("Hasil $Num1 Kuadrat = ${Kuadrat(Num1)}")
}