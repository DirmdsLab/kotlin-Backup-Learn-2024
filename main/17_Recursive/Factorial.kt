fun FactorialLoop(Input: Int): Int {
    
    var output = 1

    for(i in Input downTo 1){
        output *= i
    }
    
    return output
}


fun FactorialRecursive(Input: Int): Int {
    return when (Input){
        1 -> 1
        else -> Input * FactorialRecursive(Input - 1)
    }
}


fun main(){

    var Num1 = 5

    // Cara 1
    println("Factorial Dari $Num1 : ${FactorialLoop(Num1)} versi loop")

    // Cara 2
    println("Factorial Dari $Num1 : ${FactorialRecursive(Num1)} versi Recursive")
}