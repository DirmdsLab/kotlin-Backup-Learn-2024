class TangkapErorP2(Pesan: String) : Throwable(Pesan)

fun PrintDataValP2(Input: String) {

    if (Input.isBlank()){
        throw TangkapErorP2("Sini Eror Bang :v")
    }

    println("Hai $Input")

}


fun main(){

    try {
        
        PrintDataValP2("Shiro Neko")
        PrintDataValP2("") // Dia Ini Ni Yang Bakal Mancing Eror
        PrintDataValP2("Saya Tetap Hidup Dan Berjalan Jadi Raja Iblis :v") // Aokaokao Kagak Di Ajak Lagi

    }
    // Btw InputEror Itu kata kata yang di atas bisa di paki juga
    catch(InputEror: TangkapErorP2) {
        println("\nAda Eror Bang")
        println("Karena Ada Yang Kosong\n")
    }
    
}