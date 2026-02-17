class IniNekoApa(var InputNeko: String)

// Bakal eror
// fun IniNekoApa?.PrintDataNeko(){

//     println("Neko    : ${this!!.InputNeko}")

// }

fun IniNekoApa?.PrintDataNeko(){

    if(this != null){

        println("Neko    : ${this.InputNeko}")

    } else {

        println("Data Null")

    }
    

}

fun main(){

    var Shiro = IniNekoApa("Shiro Neko")

    Shiro.PrintDataNeko()


    var Kuro: IniNekoApa? = null

    Kuro.PrintDataNeko()

}

// Gitulah 