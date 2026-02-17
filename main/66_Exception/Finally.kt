// Eror P2 Atau 2 Ntah Lah
class TangkapErorP4(Pesan: String) : Throwable(Pesan)

// Part 2 Multy Catch

class AntiKataLoliP2(InputIlegal: String) : Throwable(InputIlegal)

// Bahan Exprimentnya :v

fun PrintDataValP4(Input: String) {

    if (Input.isBlank()){
        throw TangkapErorP4("Sini Eror Bang :v")
    } else if (Input == "Loli") {
        throw AntiKataLoliP2("FBI FBI Comingggg !!!!!!!!!")
    }

    println("Hai $Input")

}

fun main(){

    try {
        
        PrintDataValP4("Shiro Neko")
        PrintDataValP4("Loli") // Dia Ini Ni Yang Bakal Mancing Eror
        PrintDataValP4("")

        // Akhirnya Saya Di Ajak :v

        PrintDataValP4("Kenapa? Masih Kagak Di Ajak")
        PrintDataValP4("Akhirnya Saya Di Ajak :v")

        // Expetasinya Sih Gitu Ternyata Kagak :v

    }
    catch(InputEror: TangkapErorP4) {
        println("\nAda Eror Bang")
        println("Karena Ada Yang Kosong\n")
    } catch (FBIInput: AntiKataLoliP2){
        println("\n${FBIInput}\n")
    } finally {
        println("\nKagak Apa Bro Santuy :v\n")
    }
    
}