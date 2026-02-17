data class DataIsekaiNeko(
    var Name: String,
    var Age: Int,
    var Asal: String
)

fun main(){

    // Data Class
    println("Part 1")
    var ShiroNeko = DataIsekaiNeko("ShiroNeko", 17, "Isekai")
    println(ShiroNeko)
    println()    
    
    // Copy Data Class
    println("Part 2")
    var ShiroNekoOther = ShiroNeko.copy()
    println(ShiroNekoOther)
    println()    
    
    // Copy Data Tapi Di Ubah
    println("Part 3")
    var ShiroNekoChange = ShiroNeko.copy(Age = 19)
    println(ShiroNekoChange)
    println()    
    
    // Part 2 Copy Change 
    var ShiroNekoChange2 = ShiroNeko.copy(Asal = "Isekai Sebelah", Age = 20) // Kagak Masalah Acak
    println(ShiroNekoChange2)
    println()    

    var ShiroNekoChange3 = ShiroNeko.copy(Age = 20, Asal = "Isekai Awal")
    println(ShiroNekoChange3)
    println()
    
}