fun InputAny(any: Any){
    println("Nilai Any   : $any \nDengan Type : ${any::class.simpleName}\n")
}


fun main(){
    InputAny("Hmph")
    InputAny(5)
    InputAny(4.4)
    InputAny(true)
}