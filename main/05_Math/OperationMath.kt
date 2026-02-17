fun main() {
    // Math
    var Num1: Int = 10
    var Num2: Int = 3
    var Output1: Int = Num1 + Num2
    var Output2: Int = Num1 - Num2
    var Output3: Int = Num1 * Num2
    var Output4: Int = Num1 / Num2
    var Output5: Int = Num1 % Num2

    println("Bilangan Awal $Num1 Dan $Num2 Urutan Opsi ( x, -, *, /, % )")
    println("Part 1 : $Output1")
    println("Part 2 : $Output2")
    println("Part 3 : $Output3")
    println("Part 4 : $Output4")
    println("Part 5 : $Output5")
    println()

    // Part 2 Assignments
    var Val1: Int = 5
    Val1+=1
    println("Print Hasil Di += 1 : $Val1")
    Val1-=1
    println("Print Hasil Di -= 1 : $Val1")
    Val1*=5
    println("Print Hasil Di *= 5 : $Val1")
    Val1/=5
    println("Print Hasil Di /= 5 : $Val1")
    Val1%=3
    println("Print Hasil Di %= 3 : $Val1")
    println()

    // Part 3 Unary Operator
    var Val2: Int = 10
    Val2++
    println("Hasilnya++ : $Val2")
    Val2--
    println("Hasilnya-- : $Val2")

    var Val3: Int = -5
    println(Val3)

    var Val4: Boolean = true

    println("Kebalikan True : ${!Val4}")

    // Berlaku juga untuk operasi yang lain ^_^

}