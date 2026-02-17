@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Turu(val Pembuat: String)

@Turu(Pembuat = "LordTuru")

class MyApkTuru(val Name: String, val Version: Int){

    fun Info(): String = "Apk Version : $Name - $Version"

}

fun main(){

    val ApkKoNoNo = MyApkTuru("LordTuru",1295)
    println(ApkKoNoNo.Info())

}
