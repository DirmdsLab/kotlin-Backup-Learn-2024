open class NameNeko(val InputNeko: String){

    fun HelloNeko(){
        println("Hai ${this.InputNeko} Meow :v")
    }

}


final class Meow(InputMeow: String) : NameNeko(InputMeow)

class NamaKucing(InputNamaKucing: String) : NameNeko(InputNamaKucing)




fun main(){

    // Part 1

    var Shiro = NameNeko("Shiro")

    Shiro.HelloNeko()

    // Part 2

    var Kuro = Meow("Kuro")

    Kuro.HelloNeko()

    // Part 3

    var SiOrange = NamaKucing("SiOrange")

    SiOrange.HelloNeko()

}
