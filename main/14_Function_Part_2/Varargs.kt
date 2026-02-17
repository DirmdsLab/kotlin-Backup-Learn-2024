fun JumlahSemua(vararg Input: Int): Int {
    var Output = 0
    for(i in Input){
        Output += i
    }
    return Output
}

fun JumlahSemuaV2(Input: Array<Int>): Int {
    var Output = 0

    var Index = 0
    var Size = Input.size
    while(true){
        Output += Input[Index]
        Index++
        if(Index == Size){
            break
        }
    }

    return Output
}

fun main(){
    // Array 
    val NumArray: Array<Int> = arrayOf(20,20,10)
    println("Total : ${JumlahSemuaV2(NumArray)}\n")

    // varargs 
    println("Total : ${JumlahSemua(20,20,10)}\n")

    // Silakan pilih 
    // Untuk Rumus Pengulangan itu bebas kenapa beda ya gabut aja ingin ribet :v

}