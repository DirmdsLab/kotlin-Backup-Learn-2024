class TanganGwSakit<out T>(val Input: T){

    fun Tidakkkkk(): T {
        return Input
    }

}

fun main(){

    val Input1: TanganGwSakit<String> = TanganGwSakit("Dahlah")
    println(Input1.Tidakkkkk())

    val Input2: TanganGwSakit<Any> = Input1
    println(Input2.Tidakkkkk())

}