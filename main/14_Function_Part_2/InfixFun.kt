infix fun String.up(Aksi: String): String {
    when {
        Aksi == "UP" -> return this.uppercase()
        else -> return this
    }
}

infix fun String.down(Aksi: String): String {
    if (Aksi == "down"){
        return this.lowercase()
    } else {
        return this
    }
}

fun main(){
    // Sesuai Input
    println("Umaru" up "UP")
    println("Umaru" down "down")
    println()
    
    // Ngasal
    println("Umaru" up "Hmph")
    println("Umaru" down "")

}