class ConstructorPart2 {
    init {
        println("Class Di buat")
    }

    var FirstOutput = ""
    var MiddleOutput = ""
    var LastOutput = ""

    constructor(InputUser: String, MiddleInput: String, LastInput: String){
        FirstOutput = InputUser
        MiddleOutput = MiddleInput
        LastOutput = LastInput

        println("Constructor 1 Dibuat")
        
    }
    
    constructor(InputUserUp: String){
        FirstOutput = InputUserUp.uppercase()
        
        println("Constructor 2 Dibuat")
    
    }
    
    constructor(InputUser: String, LastInput: String){
        FirstOutput = InputUser
        LastOutput = LastInput

        println("Constructor 3 Dibuat")
    
    }


}

fun main(){
    
    var Umaru = ConstructorPart2("Umaru", "Chan", "Gamer")
    var UmaruUp = ConstructorPart2("Umaru")
    var UmaruV2 = ConstructorPart2("Umaruuu", "Chan")

    println("${Umaru.FirstOutput} ${Umaru.MiddleOutput} ${Umaru.LastOutput}")
    println("${UmaruUp.FirstOutput}")
    println("${UmaruV2.FirstOutput} ${UmaruV2.LastOutput}")
    
    // Dah Itu Aja :v 
    
}