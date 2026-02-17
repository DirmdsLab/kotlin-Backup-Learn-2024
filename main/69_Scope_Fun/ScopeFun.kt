class OtwIsekaiGassss(var InputName: String, var InputAge: Int){

    fun PrintData(){
        println("Hai $InputName")
        println("Age $InputAge")
    }

}


fun main(){
    println("Part 1\n")

    val Shiro = OtwIsekaiGassss("Shiro",17)
    
    // Let
    Shiro.let { 
        println(it.InputName)
        println(it.InputAge)
    }
    println()

    // Bisa Untuk Manipulasi Juga

    Shiro.let { 
        it.InputName = "Shiro Neko"
        it.InputAge = 18
    }

    Shiro.PrintData()
    
    // Run 
    println("\nPart 2\n")
    
    val Kuro = OtwIsekaiGassss("Kuro", 16)
    
    Kuro.run { 
        println(this.InputName)
        println(this.InputAge)
    }
    
    Kuro.run { 
        this.InputName = "Kuro Neko"
        this.InputAge = 15    
    }
    
    Kuro.PrintData()
    
    println("\nPart 3\n")
    // Apply 
    val Lord = OtwIsekaiGassss("Cid", 0).apply { 
        println("Puhhhh")
        println(this.InputName)
        println(this.InputAge)
    }
    
    // Disini Panggil Dirinya
    println(Lord)
    println()
    Lord.PrintData()
    
    
    println("\nPart 4\n")
    // also 
    val Cid = OtwIsekaiGassss("Cid Shadow", 16).also { 
        println("Hai ${it.InputName}")    
    }
    
    println("\n====\n")
    Cid.PrintData()
    println("\n====\n")
    println(Cid)
    
    println("\nPart 5\n")
    // With
    val ShiroNekoP2 = OtwIsekaiGassss("Shirooooo", 14)
    with(ShiroNekoP2) { 
        println("Hai ${this.InputName}")
        println("Age ${this.InputAge}")
    }
    println()
    with(ShiroNekoP2){
        this.InputName = "No Shiro No Life"
        this.InputAge = 17
    }
    ShiroNekoP2.PrintData()
    
}