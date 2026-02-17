fun String.Hai(): String = "Hai $this"

fun String.Data(Age: Int): String = "Hai $this \nAge : $Age"


fun main(){
    println("Umaru".Hai())
    println("UmaruChan".Data(18))
}