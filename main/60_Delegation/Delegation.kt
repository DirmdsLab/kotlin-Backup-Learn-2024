interface LordTuru {

    var Input: String
    fun PrintLord()

}

// Cara Biasa 

class DataLord(override var Input: String) : LordTuru {

    override fun PrintLord(){
        println("Hai ${Input}")
    }

}

// Delegation Manual
class DataLordManual(var InputObj: LordTuru) : LordTuru {
    override fun PrintLord(){
        println("Hai D : ${Input}")
    }
    override var Input = InputObj.Input
}
// Ribet Bet Manual :v

// Delegation
class DataLordDelegation(var InputObj: LordTuru) : LordTuru by InputObj
// Simple Padat Dan Jelas :v

fun main(){

    // Normal Part
    println("\nNormal Part\n")
    var Shiro = DataLord("Shiro")
    println("Isi Var : ${Shiro.Input}")
    Shiro.PrintLord()
    println()

    // Manual Part 
    println("\nPart Manual\n")
    var ManualShiro = DataLordManual(Shiro)
    println(ManualShiro.Input)
    ManualShiro.PrintLord()
    println()

    // Delegation
    println("\nDelegation\n")
    var DelegationShiro = DataLordDelegation(Shiro)
    println(DelegationShiro.Input)
    DelegationShiro.PrintLord()
    println()
    // Lebih Simple


}