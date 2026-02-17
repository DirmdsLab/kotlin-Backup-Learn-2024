@Target(AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.VALUE_PARAMETER)
annotation class TURU

class ContohTarget(@get:TURU val Input: String,
                   @param:TURU val Input2: String)

fun main(){

    val Shiro = ContohTarget("Shiro","Neko")

    println(Shiro.Input)
    println(Shiro.Input2)
}