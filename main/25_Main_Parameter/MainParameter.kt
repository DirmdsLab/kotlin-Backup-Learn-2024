fun main(args: Array<String>){
    val Total = args.size - 1
    
    println("Panjang Array : ${args.size}")
    
    // cara print 1
    println("\nCara Print 1")
    for(i in 0..Total){
        println(args[i])
    }
    
    println("\nCara Print 2")
    for(value in args){
        println(value)
    }
}

// java -jar MainParameter.jar MendingTuru Hmph ShiiRanai Mooo Shiranai