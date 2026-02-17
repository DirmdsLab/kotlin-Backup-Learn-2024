interface ShiroLastOPP {
    var Input: String
    fun PrintInput(): Unit
}

// Ganti Bentuk :v
class ShiroP1(override var Input: String) : ShiroLastOPP {
    override fun PrintInput(){
        println("Hai P1 $Input")
    }
}

class ShiroP2(override var Input: String) : ShiroLastOPP {
    override fun PrintInput(){
        println("Hai P2 $Input")
    }
}

class ShiroP3(override var Input: String) : ShiroLastOPP {
    override fun PrintInput(){
        println("Hai P3 $Input")
    }
}

fun main(){

    var ShiroNeko : ShiroLastOPP = ShiroP1("Shiro Neko Original")
    ShiroNeko.PrintInput()

    ShiroNeko = ShiroP2("Shiro Neko Kw")
    ShiroNeko.PrintInput()

    ShiroNeko = ShiroP3("Mooo Shiranai Baka Baka Bakaaaaaa")
    ShiroNeko.PrintInput()

}



// End == 