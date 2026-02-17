fun main(){
    // Buat label

    Label1@ for(i in 1..5){
        Label2@ for(j in 1..5){
            println("Print Ke : $j")
        }
        println()
    }
    println()

    // Pakai Dengan Break
    Label1@ for(i in 1..5){
        println("Loop ke : $i")
        Label2@ for(j in 1..5){
            if(j == 3){
                break // Break Normal
            }else if(i == 4){
                break@Label1 // Bakal Memperhentikan for yang di atas ini
            }
            println("Print Ke : $j")
        }
        println()
    }
    println()

    // Pakai Dengan Continue
    Label1@ for(i in 1..5){
        println("Loop Ke : $i")
        Label2@ for(j in 1..5){
            if(j == 2){
                continue // normal
            }else if(i == 3){
                continue@Label1
            }
            println("Print Ke : $j")
        }
        println()
    }
    println()

    // Pakai Dengan Return

    fun ReturnFun(Input: String = ""): String{
        
        val Hasil = Label1@ {

            if(Input == ""){
                return@Label1 "Hmph"
            } else {
                return@Label1 Input
            }
        }
        return Hasil()
    }

    println(ReturnFun("Umaru"))
    println(ReturnFun(""))

}