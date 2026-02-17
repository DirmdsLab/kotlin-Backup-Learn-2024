fun main(){
    // Basic String 
    
    var Name: String = "Umaru"
    var Last: String = "Chan"

    // Cara 1 Tidak Rekomen
    println("Part 1")
    println(Name + " " + Last)

    println() // Hmm

    // Cara 2 
    println("Part 2")
    println("$Name $Last")

    // String Length
    println("Panjang String Dari 'Umaru' : ${Name.length}")

    println()

    println("Part 3")

    // String MultyLine
    var MultyString: String = """
        Umaru Chan
        Asal Dunia 2D
        Dah Itu Aja
    """
    println(MultyString)
    
    println("Make Better")
    MultyString = """
    |Umaru Chan
    |Asal Dunia 2D
    |Dah Itu Aja
    """.trimMargin()
    println(MultyString)

    println("\nMake Better Part 2") // \n Buat New line
    MultyString = """
    >Umaru Chan
    >Asal Dunia 2D
    >Dah Itu Aja (Btw Rapinya Di Code)
    """.trimMargin(">")
    println(MultyString)

    // Dah See Yuuu :v
    
}