class ShiroNekooo {

    // Part 1

    private var Name: String = "Shiro"

    fun PrintName(){

        println(Name)

    }

}

open class ShiroNekoP2 {

    protected var Name: String = "Shiro P2"

    fun PrintOriginal(){

        println(Name)

    }

}


class AnakShiroNeko : ShiroNekoP2(){

    fun PrintDariAnakaShiroNeko(){

        println("Dari Anak Shiro : $Name")

    }

}


fun main(){

    var Neko = ShiroNekooo()

    // Private jadi tidak bisa di akses
    // println(Neko.Name)

    // Hanya Bisa di akses kalau di tempat dia berada
    Neko.PrintName()
    println()

    var NekoP2 = ShiroNekoP2()

    // NekoP2.Name 
    // kagak bisa soal terlindungi
    NekoP2.PrintOriginal() // Sama Kek Private Tapi

    // Juga Bisa Di akses Oleh Anak Nya :v

    var AnakNeko = AnakShiroNeko()
    AnakNeko.PrintDariAnakaShiroNeko()


    // kalau tampa beri tanda tersebut otomatis public dan ada satu lagi internal itu bagian project lebih rinci 


}