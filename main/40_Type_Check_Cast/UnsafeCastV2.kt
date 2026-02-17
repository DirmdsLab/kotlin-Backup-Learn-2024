fun PrintUnsafeV2(any: Any){

    val Value = any as? String
    println(Value)

}

fun main(){

    PrintUnsafeV2("Hmph") // Bakal Work
    PrintUnsafeV2(4) // Jadi Null 

    // cara lebih aman dari sebelumnya 

}