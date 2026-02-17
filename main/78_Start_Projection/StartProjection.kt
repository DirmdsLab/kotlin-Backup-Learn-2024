// fun PrintPanjangArray(Input: Array<Int>){

//     println("Panjang : ${Input.size}")

// }

// Solusinya

fun PrintPanjangArray(Input: Array<*>){

    println("Panjang : ${Input.size}")

}

fun main(){

    val ShiroArray = arrayOf(1,2,3,4,5)
    val ShiroArrayP2 = arrayOf("Hmph","Shiranai","Baka")

    PrintPanjangArray(ShiroArray)
    PrintPanjangArray(ShiroArrayP2)

}