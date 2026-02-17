interface LordNeko {

    var NekoName: String
    fun PrintNekoName(): Unit

}

class BawahanNeko(override var NekoName: String) : LordNeko {

    override fun PrintNekoName(){

        println("Name Neko : $NekoName")

    }

}


interface SecondLordNeko {

    var NameNeko: String
    fun PrintNekoName(){

        println("Saya Dari Second : $NameNeko")

    }

}


class BawahanSecondNeko(override var NameNeko: String) : SecondLordNeko {

    init {
        println("Bawahan Second Neko Di Buat")
    }

    fun SayaSiapa(Input: String){

        println("Anda Adalah : $Input")

    }

}



fun main(){

    println("\nPart 1\n")
    
    var Shiro = BawahanNeko("Shiro Neko")
    println(Shiro.NekoName)
    Shiro.PrintNekoName()
    
    println("\nPart 2\n")

    var Kuro = BawahanSecondNeko("Kuro Neko")
    println(Kuro.NameNeko)
    Kuro.PrintNekoName()

    println("\nPart Gaje\n")
    Kuro.SayaSiapa("Raja Iblis?")

}