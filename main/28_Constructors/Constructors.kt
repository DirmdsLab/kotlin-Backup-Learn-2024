package umaru.constructor

class Constructor(InputName: String, InputLast: String = "", InputAge: Int){

    var Name: String = InputName
    var Last: String = InputLast
    var Age: Int = InputAge

}


fun main(){

    // Person 1

    var Umaru = Constructor("Umaru", "Chan", 18)
    
    println("Name : ${Umaru.Name} ${Umaru.Last}\nAge  : ${Umaru.Age}\n")

    // NPC

    var Cid = Constructor(InputName = "Cid",InputAge = 16)

    println("Name : ${Cid.Name}\nAge  : ${Cid.Age}\n")

}