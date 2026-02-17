class Contoh(var InputName: String, var InputAge: Int){

    fun PrintData(){
        println("Name : $InputName")
        println("Age  : $InputAge")
    }

}

fun main(){

    val Shiro = Contoh("Shiro", 17)
    println(Shiro.InputName)


    val InfoShiro = Shiro::class

    val ConstructorNya = InfoShiro.constructors
    println(ConstructorNya)

    val FunsiNya = InfoShiro.isFun
    println(FunsiNya)

    val MemberNya = InfoShiro.members
    println("Start : ${MemberNya} : End")
    println()

    val InfoShiro1 = Contoh::class

    val ConstructorNya1 = InfoShiro.constructors
    println(ConstructorNya1)

    val FunsiNya1 = InfoShiro.isFun
    println(FunsiNya1)

    val MemberNya1 = InfoShiro.members
    println("Start : ${MemberNya1} : End")



}

