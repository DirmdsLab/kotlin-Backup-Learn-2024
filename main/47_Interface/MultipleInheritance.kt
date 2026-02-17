interface LordNekoNeko {

    var NameNeko: String
    fun PrintNeko(){

        println("Nama Neko : $NameNeko")

    }

}

interface WarnaNeko {

    var WarnaNeko: String
    fun PrintWarnaNeko(){

        println("Warna     : $WarnaNeko")

    }

}


class DataNekoNeko(override var NameNeko: String, override var WarnaNeko: String) : LordNekoNeko, WarnaNeko {

    fun PrintData(){

        PrintNeko()
        PrintWarnaNeko()

    }

}


fun main(){

    var ShiroNeko = DataNekoNeko("Shiro Neko", "Shiro")

    ShiroNeko.PrintData()

}