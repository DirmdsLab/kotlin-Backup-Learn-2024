fun main(){

    // Nulis Array 
    val Tsundere: Array<String> = arrayOf("Hmph","Mooo Shiranai","Au Ah")
    println(Tsundere) // kagak bakal keluar list nya
    println()
    
    // Cara Print part 1
    println(Tsundere[0])
    println(Tsundere[1])
    println(Tsundere[2])
    println()

    // Cara Print part 2
    val TotalEps: Array<Int> = arrayOf(12,13,24)
    println(TotalEps.get(0))
    println(TotalEps.get(1))
    println(TotalEps.get(2))
    println()

    // Ubah Data Array Part 1 
    Tsundere[2] = "Hmm" // Kenapa bisa di rubah soal val

    // Part 2
    Tsundere.set(1,"HMPH") // karena isi array tidak apa dirubah kalau di val

    println(Tsundere[0])
    println(Tsundere[1])
    println(Tsundere[2])
    println()

    // Array Null 
    val NameRandom: Array<String?> = arrayOfNulls(5)
    println(NameRandom[0])
    NameRandom[0] = "LordTuru"
    println(NameRandom[0])

    println("Ukuran Name Random : ${NameRandom.size}")
    // Kalau lebih dari ukuran index bakal eror
    // println(NameRandom[5]) Begitu juga set array nya

    println()

    println("Ukuran Array : ${Tsundere.size}")

}