fun main(){
    // Range
    val Hmph = 1..100
    println(Hmph)

    // Total Range 
    println("Total Range : ${Hmph.count()}")

    // Cek Data
    println("Apakah 40 Ada Di Hmph? : ${Hmph.contains(40)}")

    // Ambil Nilai Awal Dan Akhir
    println("Nilai Awal ${Hmph.first} Dan Nilai Akhir ${Hmph.last}")

    // Step 
    println("Apa Stepnya? : ${Hmph.step}")
    
    // Print Doang
    println()

    // range mundur 
    val hpmH = 50 downTo 1

    println(hpmH)

    // Total Range 
    println("Total Range : ${hpmH.count()}")

    // Cek Data
    println("Apakah 40 Ada Di hpmH? : ${hpmH.contains(40)}")

    // Ambil Nilai Awal Dan Akhir
    println("Nilai Awal ${hpmH.first} Dan Nilai Akhir ${hpmH.last}")

    // Step 
    println("Apa Stepnya? : ${hpmH.step}")

    // print doang
    println()

    // range dengan step
    val HmphStep = 1..100 step(5)

    println(HmphStep)

    // Total Range 
    println("Total Range : ${HmphStep.count()}")

    // Cek Data
    println("Apakah 40 Ada Di HmphStep? : ${HmphStep.contains(40)}")

    // Ambil Nilai Awal Dan Akhir
    println("Nilai Awal ${HmphStep.first} Dan Nilai Akhir ${HmphStep.last}")

    // Step 
    println("Apa Stepnya? : ${HmphStep.step}")

    // print doang
    println()

    // Sebaliknya juga gitu

    val RangeKebalikStepHmph = 100 downTo 1 step 4

    println(RangeKebalikStepHmph)

    // Total Range 
    println("Total Range : ${RangeKebalikStepHmph.count()}")

    // Cek Data
    println("Apakah 40 Ada Di RangeKebalikStepHmph? : ${RangeKebalikStepHmph.contains(40)}")

    // Ambil Nilai Awal Dan Akhir
    println("Nilai Awal ${RangeKebalikStepHmph.first} Dan Nilai Akhir ${RangeKebalikStepHmph.last}")

    // Step 
    println("Apa Stepnya? : ${RangeKebalikStepHmph.step}")

    // print doang
    println()

}