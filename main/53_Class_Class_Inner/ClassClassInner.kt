class NekoIsekai(var Input: String){

    var Hmph = "Shiranai"

    // Walau Di Dalam Kagak Bisa Akses
    class NekoReal(var Input: String){

        fun Neko(){
            // println("Saya Neko Real ${Input} ${this.Hmph}")
            println("Saya Real Neko $Input")
        }

    }
    
    // Part 2 Gimana Cara Supaya Bisa Akses 
    inner class RealNeko(var Input: String){

        fun Neko(){

            println("Saya Real Dari Yang Real")
            println("Input       : ${Input}\nThis Input  : ${this@NekoIsekai.Hmph}")
            println("Part 2 This : ${this@NekoIsekai.Input}")

        }

    }


}


fun main(){

    println("Part 1")
    var Shiro = NekoIsekai("Shiro Neko")
    println(Shiro.Input)
    println()
    
    println("Part 2")
    var ShiroReal = NekoIsekai.NekoReal("Shiro Real")
    println(ShiroReal.Input)
    ShiroReal.Neko()
    println()

    println("Part 3")
    var RealShiro = Shiro.RealNeko("Real Shiro")
    RealShiro.Neko()
    
}