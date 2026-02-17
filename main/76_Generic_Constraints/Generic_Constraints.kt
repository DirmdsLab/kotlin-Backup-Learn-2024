open class ShiroNekoFans

class TimPutih : ShiroNekoFans()

class TimIsekai : ShiroNekoFans()

class NekoShiro<T: ShiroNekoFans>(val InputShiro: T)

// Tumbakl

class NekoNekoNekoNekoNeko

fun main(){

    val ShiroNekoNeko = NekoShiro(TimPutih())
    val ShiroNekoNekoP2 = NekoShiro(TimIsekai())
    
    // val ShiroEror = NekoShiro(NekoNekoNekoNekoNeko()) 
    // bakal eror yang baris ke 3 
    // Ini Satu lagi
    // val ShiroErorP2 = NekoShiro("Shiro")
    // Karena Yang Diizinkan Cuma fans shiro Neko

    println(ShiroNekoNeko)
    println(ShiroNekoNekoP2)
    
    println(ShiroNekoNeko.InputShiro)
    println(ShiroNekoNekoP2.InputShiro)
}