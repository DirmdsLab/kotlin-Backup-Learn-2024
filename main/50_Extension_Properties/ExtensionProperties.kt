class LordCatIsekai(var NameCat: String)

val LordCatIsekai.JadikanLord: String
    get() = NameCat.uppercase()

fun main(){


    var Orange = LordCatIsekai("Si Orange")
    println(Orange.NameCat)
    println(Orange.JadikanLord)
    println(Orange.NameCat)


}