interface ShiroNekoLover {

    var Name: String
    fun PrintName(){

        println("Name    : $Name")

    }

}


interface DimensiNeko : ShiroNekoLover {

    var Dimensi: String
    fun PrintDimensi(){

        println("Dimensi : $Dimensi")

    }

}


interface PrintDataWaifu : DimensiNeko {

    fun PrintWaifu(){

        PrintName()
        PrintDimensi()

    }

}

class WaifuKokKucing(override var Name: String) : PrintDataWaifu {

    override var Dimensi: String = "2D"

}


fun main(){

    var ShiroNeko = WaifuKokKucing("Shiro Neko")
    ShiroNeko.PrintWaifu()

}

// Cara Memperribet Hidup :v