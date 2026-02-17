fun Name(Name: String? = null): Unit {
    when {
        Name == null -> println("Masukan Nilai")
        else -> println("Hai $Name")
    }
}

fun main(){
    Name()
    Name("UmaruChan")
}