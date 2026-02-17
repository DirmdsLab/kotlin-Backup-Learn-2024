class ConstructorTest(InputUser: String, MiddleInput: String, LastInput: String){

    init{
        println("Class Di buat")
    }


    constructor(InputUser: String, LastInput: String): this (
        InputUser,"",LastInput
    ){
        println("Constructor Dibuat")
    }

    var FirstOutput = InputUser
    var MiddleOutput = MiddleInput
    var LastOutput = LastInput

}


fun main(){
    var Umaru = ConstructorTest("Umaru","Chan","Gamer")
    var UmaruV2 = ConstructorTest("Umaruuu","Channn")

    println("${Umaru.FirstOutput} ${Umaru.MiddleOutput} ${Umaru.LastOutput}")
    println("${UmaruV2.FirstOutput} ${Umaru.LastOutput}")

}