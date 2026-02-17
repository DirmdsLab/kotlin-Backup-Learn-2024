fun UnsafeTest(any: Any){

    val Value = any as String
    println(Value)

}



fun main(){

    // Btw Ini Kagak Aman :v nama nya aja udah unsafe 

    UnsafeTest("Hmph") // Bakal Work
    UnsafeTest(4) // Bakal Eror

    // Hasilnya Di Terminal ^_^

}