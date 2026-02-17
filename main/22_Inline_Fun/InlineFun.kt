fun Hello(Input: () -> String): String {
    return "Hai ${Input()}"
}

inline fun HelloV2(Input: () -> String): String {
    return "Hai ${Input()}"
}

inline fun HelloAge(Input: String, noinline Last: (String) -> String): String {
    return "Hai ${Last(Input)}"
}

fun main(){
    // Part 1
    println(Hello {"UmaruChan"})
    println(HelloV2 { "UmaruChanV2" })
    println(HelloAge("Umaru") { Last: String -> Last + "Chan" })
}

// Kagak Ada yang special tapi bakal berefek ke performa di hasil akhir 
// kalau inline sampai di java kagak manggil block mulu jadi kalau kasusnya data besar bakal impact ke peforma
// kalau ingin lihat perbedaanya lihat bytecode (kotlinc .\InlineFun.kt -d out)