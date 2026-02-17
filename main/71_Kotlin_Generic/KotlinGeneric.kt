// Part 1

class ShiroIsekai<T>(val InputName: T){

    fun PrintShiro(): T {
        return InputName
    }

}

// Part 2
class ShiroIsekaiP2<T,U>(val InputName: T, val InputAge: U){

    fun PrintIsiData(){
        println("Name : ${InputName}")
        println("Age  : ${InputAge}")
    }

}

fun main(){
    // Part 1
    // Pembuatan Pertama 
    var ShiroNeko: ShiroIsekai<String> = ShiroIsekai<String>("Shiro Neko")
    println(ShiroNeko.InputName)
    println(ShiroNeko.PrintShiro())
    println()
    
    // Cara Buat Kedua
    var ShiroNekoP2: ShiroIsekai<String> = ShiroIsekai("Shiro Neko P2")
    println(ShiroNekoP2.InputName)
    println(ShiroNekoP2.PrintShiro())
    println()
    
    // Cara Tervavorit :v
    var ShiroNekoP3 = ShiroIsekai("Shiro Neko P3")
    println(ShiroNekoP3.InputName)
    println(ShiroNekoP3.PrintShiro())
    println()
    
    // End Part 1
    // Masuk Part 2

    println("\nPart 2\n")

    val ShiroCat = ShiroIsekaiP2("Shiro P2", "InputAge")
    val ShiroCatP2 = ShiroIsekaiP2("Shiro P2 P2 :v", 17)

    ShiroCat.PrintIsiData()
    println()
    ShiroCatP2.PrintIsiData()

}