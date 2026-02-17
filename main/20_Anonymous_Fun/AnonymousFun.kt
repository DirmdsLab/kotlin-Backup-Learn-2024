fun Hello(Input: String, LamInput: (String) -> String): String{
    return "Hai ${LamInput(Input)}"
}

fun main(){

    val AnonymousFun = fun(Input: String): String {
        return when {
            Input.isBlank() -> "Bro"
            else -> Input.uppercase() 
        }
    }

    println(Hello("UmaruChan",AnonymousFun))
    println(Hello("",AnonymousFun))

    println(Hello("Umaruuuuu", fun(Input: String): String {return when {Input.isBlank() -> "Bro"; else -> Input.uppercase()}}))
    println(Hello("", fun(Input: String): String {return when {Input.isBlank() -> "Bro"; else -> Input.uppercase()}}))

}
// Dah