package fist.oop

// Sesimple Ini Kok Buat Kelas
class OopFist {

    // Properties
    var Name: String = "Umaru"
    var Last: String = "Chan"
    val SystemV: Int = 95

}

fun main(){
    val Umaru = OopFist() // Obj

    println(Umaru)
    println()
    
    // Akses Properties
    println(Umaru.Name)
    println(Umaru.Last)
    println(Umaru.SystemV)
    println()

    // Merubah Properties
    Umaru.Name = "Umaru Chan"
    Umaru.Last = ""

    // Umaru.SystemV = 4 seperti pengertian yang di dasar
    println(Umaru.Name)
    println(Umaru.SystemV)
    println(Umaru.Last)

}

// Dah Itu Aja System nya