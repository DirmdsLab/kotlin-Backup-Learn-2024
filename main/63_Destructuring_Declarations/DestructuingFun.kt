data class MinimalMaxsimal(var Min: Int, var Max: Int)

fun MinimalPcMaxApa(Input1: Int, Input2: Int): MinimalMaxsimal {

    return when {

        Input1 < Input2 -> MinimalMaxsimal(Input1, Input2)
        else -> MinimalMaxsimal(Input2, Input1)

    }

}

fun main(){

    // Part 1
    var (Minimal, Maxsimal) = MinimalPcMaxApa(10, 5)
    println(Minimal)
    println(Maxsimal)

    // Part 2
    var (Part2, Part2Lagi) = MinimalPcMaxApa(6, 9)
    println(Part2)
    println(Part2Lagi)

}