const val NameWorld: String = "Isekai"
// const var Version: Int = 2 // Harus Val
const val Version: Int = 2

fun main() {
    // variable 

    val Name: String = "Umaru" // val kagak bisa di rubah
    var Age: Int = 17
    var Address: String = "Another World 2D"

    println(Name)
    println(Age)
    println(Address)
    
    println()
    
    // Val Kagak Bisa Di Rubah
    // Name = "UmaruChan" // Kagak Bisa 
    
    // Rubah Var 
    Age = 18
    Address = "Isekai"
    
    println(Name)
    println(Age)
    println(Address)
    println()

    // btw juga bisa di tulis gini 
    val Kebiasaan = "Playing Game" // Otomatis String
    var BerapaLama = 8 // Otomatis Int

    println("Kebiasaan $Kebiasaan Berapa Lama $BerapaLama Jam\n")

    // Null Var Kagak Rekomen
    var Hmph: String? = null

    println(Hmph)
    // println(Hmph.length) // Kalau Null Kagak Bisa Normal Gini
    println(Hmph?.length)
    println()
    
    Hmph = "Hmm"
    println(Hmph)
    // println(Hmph?.length) // Kalau Ada Nilainya Tinggal Panggil Kek Biasa Aja
    println(Hmph.length)
    println()
    

    // const variable 
    // Untuk Global
    println(NameWorld)
    println(Version)

}