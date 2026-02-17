fun main(){
    var Counter = 0

    val CounterClosure: () -> Unit = {println("Counter ++");Counter++}

    println(Counter)
    CounterClosure()
    println(Counter)
    CounterClosure()
    println(Counter)
    CounterClosure()
    println(Counter)
    CounterClosure()
    println(Counter)
    CounterClosure()
    println(Counter)

}