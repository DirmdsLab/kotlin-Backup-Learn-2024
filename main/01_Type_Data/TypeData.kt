fun main() {
    // Type Data 
    
    // Byte
    var BilanganByte: Byte = 5
    println("Bilangan ${BilanganByte::class.simpleName}   : $BilanganByte")

    // Short 
    var BilanganShort: Short = 10
    println("Bilangan ${BilanganShort::class.simpleName}  : $BilanganShort ")

    // Int
    var BilanganInt: Int = 100
    println("Bilangan ${BilanganInt::class.simpleName}    : $BilanganInt")

    // Long
    var BilanganLong: Long = 1000L
    println("Bilangan ${BilanganLong::class.simpleName}   : $BilanganLong")

    println() // Penambah baris aja

    // Float
    var BilanganFloat: Float = 100.4F
    println("Bilangan ${BilanganFloat::class.simpleName}  : $BilanganFloat")

    // Double
    var BilanganDouble: Double = 1220.7
    println("Bilangan ${BilanganDouble::class.simpleName} : $BilanganDouble")

    println() // Lagi

    // Int Normal, Hex, Bin
    // Print Int Normal
    var NormalInt: Int = 50
    var HexInt:    Int = 0x32
    var BinInt:    Int = 0b110010

    println("Normal Int : $NormalInt")
    println("Normal Hex : $HexInt")
    println("Normal Bin : $BinInt")

    println()

    // Pemisah Angka Supaya Mudah Di Baca 
    var Pemisah: Long = 9_000_000L
    println("Hasil : $Pemisah")

    println() // Biasa

    // Conversion
    var OriginalInt: Int = 10
    var ConverToByte: Byte = OriginalInt.toByte()
    var ConverToShort: Short = OriginalInt.toShort()
    // var ConverToInt // Original udah int buat apa :v
    var ConverToLong: Long = OriginalInt.toLong()

    var ConverToFloat: Float = OriginalInt.toFloat()
    var ConverToDouble: Double = OriginalInt.toDouble()

    // Saya Pisah Tapi Paham Lah
    // Byte 
    print("Type Asli ${OriginalInt::class.simpleName} = $OriginalInt ")
    println("Convert Ke ${ConverToByte::class.simpleName} = $ConverToByte")
    
    // Short 
    print("Type Asli ${OriginalInt::class.simpleName} = $OriginalInt ")
    println("Convert Ke ${ConverToShort::class.simpleName} = $ConverToShort")
    
    // Int
    println("Type Asli ${OriginalInt::class.simpleName} = $OriginalInt ")
    
    // Long 
    print("Type Asli ${OriginalInt::class.simpleName} = $OriginalInt ")
    println("Convert Ke ${ConverToLong::class.simpleName} = $ConverToLong")
    
    // Float 
    print("Type Asli ${OriginalInt::class.simpleName} = $OriginalInt ")
    println("Convert Ke ${ConverToFloat::class.simpleName} = $ConverToFloat")

    // Double 
    print("Type Asli ${OriginalInt::class.simpleName} = $OriginalInt ")
    println("Convert Ke ${ConverToDouble::class.simpleName} = $ConverToDouble")

    println() // Hmph

    // Char
    var SingleChar: Char = 'Y'
    println("Saya Mengprint Char : $SingleChar")

    println()

    // Boolean
    var Truelah: Boolean = true
    var Falselah: Boolean = false

    println("Truekah? $Truelah")
    println("FalseKah? $Falselah")

}
// Yee 100 Baris Kotlin :v 