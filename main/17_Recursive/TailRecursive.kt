// Part 1

tailrec fun HitungMundur(Input: Int){
    println("value : $Input")
    when {
        Input < 0 -> HitungMundur(Input - 1)
    }
}

// Part 2

tailrec fun Faktorial(Input: Int, Index: Int = 1): Int {
    println("Input Ke : $Input")
    return when(Input) {
        1 -> Index
        else ->Faktorial(Input - 1,Input * Index)
    }
}

fun main(){
    HitungMundur(5)
    println(Faktorial(5))
}