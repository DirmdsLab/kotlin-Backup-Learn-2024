fun main() {
    // When Part 1

    // val Tsundere = "Hmph"
    var Tsundere = "Au Ah"
    // val Tsundere: String? = null

    when (Tsundere) {
        "Hmph" -> println("Moo Shiranai")
        "Au Ah" -> println("Au Ah Gelap")
        else -> println("Hilang...")
    }

    println()

    // Part 2 
    val Num = 4 // Ubah Aja
    when (Num) {
        0, 1, 2 -> println("Ehehe")
        else -> println("Dah Lah")
    }
    println()

    // Part 3

    Tsundere = "^_^"
    val ListTsundere = arrayOf("Hmph","Moo Shiranai","Hmm")

    when (Tsundere) {
        in ListTsundere -> println("Tsundereeee")
        !in ListTsundere -> println("Hmph")
    }
    println()

    // Part 4 
    val ThisInt = 1
    
    when (ThisInt) {
        is Int -> println("Ini Int")
        !is Int -> println("Bukan Int")
    }
    println()

    // Part 5

    val Num1 = 5
    when {
        Num1 == 5 -> println("Sama")
        Num1 < 5 -> println("Kecil")
        Num1 > 5 -> println("Besar")
        else -> println("Hmph")
    }

}