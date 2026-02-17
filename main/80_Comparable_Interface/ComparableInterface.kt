class Buah(val NameBuah: String, val Jumlah: Int) :
    
    Comparable<Buah>{
        override fun compareTo(other: Buah): Int {
            return Jumlah.compareTo(other.Jumlah)
        }
    }


fun main(){

    val Buah1 = Buah("Pisang",5)
    val Buah2 = Buah("PisaNgV2",4)

    println(Buah1 < Buah2)
    println(Buah1 > Buah2)

}
    
