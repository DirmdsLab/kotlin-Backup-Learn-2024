open class NameInu(val InputNameInu: String) {

    open fun HayInu(){
        println("Hai ${this.InputNameInu} Guk-Guk")
    }

}

class DataInu(val FistNameInu: String, val AgeInu: Int, val TypeInu: String) : NameInu(FistNameInu) {

    override fun HayInu(){
        println("Name : ${this.InputNameInu}\nAge  : $AgeInu\nType : $TypeInu")
    }

}

class BunyiInu(val FistNameInu: String,var SoundInu: String) : NameInu(FistNameInu) {
    final override fun HayInu(){
        println("Hai ${this.InputNameInu} $SoundInu")
    }
}

fun main(){

    // part 1

    var KuroInu = NameInu("Kuro Inu")

    KuroInu.HayInu()
    println()
    
    // Part 2
    
    var ShiroInu = DataInu("Shiro Inu", 3, "Cool Inu")
    
    ShiroInu.HayInu()
    println()
    
    // Part 3
    
    var OrenjiInu = BunyiInu("Orenji Inu", "Meow?")

    OrenjiInu.HayInu()
    println()

}