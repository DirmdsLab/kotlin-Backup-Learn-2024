fun SapaanIf(Input: String = " "): String {
    return if (Input == " "){
        "Hai Bang :v"
    } else {
        "Hai $Input"
    }
}

fun SapaanWhen(Input: String = " "): String {
    return when {
        Input == " " -> "Hai Bang"
        else -> "Hai $Input"
    }
}

fun SapaanWhenV2(Input: String = ""): String {
    return when (Input){
        "" -> "Hai Bang"
        else -> "Hai $Input"
    }
}

fun main(){
    println(SapaanIf("Umaru Part 1"))
    println(SapaanWhen("Umaru Part 2"))
    println(SapaanWhenV2("Umaru Part 3"))
}