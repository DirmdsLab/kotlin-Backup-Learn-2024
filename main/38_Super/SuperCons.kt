open class Gambar2D(val Name: String, val JumlahSudut: Int, var Warna: String){

    init {
        if(Warna == ""){
            Warna = "Tidak Ada"
        }
    }

    constructor(Name: String, JumlahSudut: Int): this (Name,JumlahSudut,""){
        println("Constructor Dibuat")
    }

    constructor(Warna: String): this ("Persegi",4,Warna){
        println("Constructor ke 2")
    }

    

}

class Image2D : Gambar2D {
    constructor() : super("Persegi",4,"")
    constructor(Name: String): super (Name,4,"")
}

fun main(){

    println("Class Umata\n")
    val Persegi = Gambar2D("Persegi",4,"Biru")
    println("Name  : ${Persegi.Name}\nSudut : ${Persegi.JumlahSudut}\nWarna : ${Persegi.Warna}\n")
    

    println("\nClass Cabang :v\n")

    val PersegiBiasa = Image2D()
    println("Name  : ${PersegiBiasa.Name}\nSudut : ${PersegiBiasa.JumlahSudut}\nWarna : ${PersegiBiasa.Warna}\n")
    
    val PersegiBiasaP2 = Image2D("Kok Datar")
    println("Name  : ${PersegiBiasaP2.Name}\nSudut : ${PersegiBiasaP2.JumlahSudut}\nWarna : ${PersegiBiasaP2.Warna}\n")

    

}