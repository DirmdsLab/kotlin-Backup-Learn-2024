fun Hai(Input: String, InputLam: (String) -> String): String = "Hai ${InputLam(Input)}"

fun main(){
    // Part 1
    val Perbesar: (String) -> String = {it.uppercase()}

    println(Hai("Umaru",Perbesar))

    // Part 2

    println(Hai("Umaru", {Input: String -> Input.lowercase()}))

    // Part 2
    println(Hai("UmaruChan") { InputLam: String -> InputLam.uppercase() })

}