fun Perbesar(Input: String): String {
    return Input.uppercase()
}

fun PerbesarV2(Input1: String, Input2: String): String = "${Input1.uppercase()} ${Input2.uppercase()}"

fun main(){

    // Lambda Part 1
    val Hello: (String) -> String = {
        "Hai $it" // It Khusus Satu Parameter
    }

    // Panggil
    println(Hello("Umaru"))

    // Part 2
    val Perkalian: (Int, Int) -> Int = {X: Int, Y: Int ->
        X * Y
    }

    println(Perkalian(5,5))

    // Part 3

    val PerbesarLabda: (String) -> String = ::Perbesar

    println(PerbesarLabda("Umaru"))

    // Part 4

    val PerbesarLabdaV2: (String,String) -> String = ::PerbesarV2

    println(PerbesarLabdaV2("Umaru","Chan"))

    // Dah 

}