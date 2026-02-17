package umaru.init


class TestInit(InputName: String, InputAge: Int){

    init{
        println("Test Init Works")
    }

    var Name: String = InputName
    var Age: Int = InputAge
}


fun main(){

    var Umaru = TestInit("Umaru", 18)

    println("Name : ${Umaru.Name}")
    println("Age  : ${Umaru.Age}")

}