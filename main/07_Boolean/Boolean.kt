fun main() {
    // Boolean 

    var TrueKah = true; var FalseKah = false
    println("Operasi &&")
    println("$TrueKah  && $TrueKah  : ${TrueKah&&TrueKah}")
    println("$TrueKah  && $FalseKah : ${TrueKah&&FalseKah}")
    println("$FalseKah && $TrueKah  : ${FalseKah&&TrueKah}")
    println("$FalseKah && $FalseKah : ${FalseKah&&FalseKah}")
    println()
    
    println("Operasi ||")
    println("$TrueKah  || $TrueKah  : ${TrueKah||TrueKah}")
    println("$TrueKah  || $FalseKah : ${TrueKah||FalseKah}")
    println("$FalseKah || $TrueKah  : ${FalseKah||TrueKah}")
    println("$FalseKah || $FalseKah : ${FalseKah||FalseKah}")
    println()

    println("Kebalikan ! ")
    println("Kebalikan Dari $TrueKah  : ${!TrueKah}")
    println("Kebalikan Dari $FalseKah : ${!FalseKah}")

}