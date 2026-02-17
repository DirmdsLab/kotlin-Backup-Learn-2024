// Eror P2 Atau 2 Ntah Lah
class TangkapErorP3(Pesan: String) : Throwable(Pesan)

// Part 2 Multy Catch

class AntiKataLoli(InputIlegal: String) : Throwable(InputIlegal)

// Bahan Exprimentnya :v

fun PrintDataValP3(Input: String) {

    if (Input.isBlank()){
        throw TangkapErorP3("Sini Eror Bang :v")
    } else if (Input == "Loli") {
        throw AntiKataLoli("FBI FBI Comingggg !!!!!!!!!")
    }

    println("Hai $Input")

}

fun main(){

    try {
        
        PrintDataValP3("Shiro Neko")
        PrintDataValP3("Loli") // Dia Ini Ni Yang Bakal Mancing Eror
        PrintDataValP3("Kenapa? Masih Kagak Di Ajak")

    }

    // Btw InputEror Itu kata kata yang di atas bisa di paki juga
    catch(InputEror: TangkapErorP3) {
        println("\nAda Eror Bang")
        println("Karena Ada Yang Kosong\n")
    } catch (FBIInput: AntiKataLoli){
        println("FBI Coming Bro")
    }
    
}