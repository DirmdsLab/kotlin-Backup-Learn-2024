open class Tech(){

    open val Device = "Neko Phone"

}

class DataTech(InputNewData: String) : Tech() {
    override var Device = InputNewData
    val OldName = super.Device
}

fun main(){

    var Neko = DataTech("Kawaii Phone")
    println("Data Override : ${Neko.Device}")
    println("Data Lama     : ${Neko.OldName}\n")


    val Inu = Tech()
    println("Dari Induk    : ${Inu.Device}\n")    

}