fun DataName(Name: String, Last: String, Age: Int = 0){
    println("Name : $Name $Last")
    when{
        Age == 0 -> println("Age  : Privasi")
        Age != 0 -> println("Age  : $Age")
    }
}

fun main(){
    DataName("Umaru","Chan",18)
    println()
    DataName("Umaru","Chan")
}