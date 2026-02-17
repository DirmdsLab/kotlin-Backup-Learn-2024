open class PrintNeko(){

    open val Name = ""
    open val Age : Int? = null 

}

class DataNeko(): PrintNeko(){
    override var Name = "Shiro"
    override var Age = 0
}

fun main(){

    val ShiroNeko = DataNeko()

    ShiroNeko.Name = "Shiro Neko"
    ShiroNeko.Age = 3

    println("Name : ${ShiroNeko.Name}\nAge  : ${ShiroNeko.Age}")
    
}