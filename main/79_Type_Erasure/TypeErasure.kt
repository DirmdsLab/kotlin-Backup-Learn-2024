class HmmShiranai<T>(Input: T){
    private val DataRahasia: T = Input
    fun GetData(): T = DataRahasia
}


fun main(){

    val Shiro = HmmShiranai("Shiro Neko")
    val DataShiro = Shiro.GetData()
    println(Shiro.GetData())

    val ShiroInt = Shiro as HmmShiranai<Int>
    println(ShiroInt.GetData())
    val Number = Shiro.GetData()

    println(DataShiro)

}