interface IsekaiIcoming {

    fun PrintIsekai(): Unit

}


fun PrintDataIsekai(PesanIsekai : IsekaiIcoming){

    PesanIsekai.PrintIsekai()

}

fun main(){

    PrintDataIsekai(object : IsekaiIcoming {
        override fun PrintIsekai() = println("Pesan Dari Isekai Adalah : Mending Rakit Pc :v")
    })

    PrintDataIsekai(object : IsekaiIcoming {
        override fun PrintIsekai() = println("Mending Turu")
    })

    // Dah itu aja :v 

}