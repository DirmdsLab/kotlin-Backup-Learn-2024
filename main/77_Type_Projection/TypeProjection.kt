class FansNekoNeko<T>(var Input: T)


fun main(){

    val ShiroNeko = FansNekoNeko("Shiro Neko")
    
    // Eror
    // val KuroNeko : FansNekoNeko<Any> = ShiroNeko 

    // cara Fix 

    fun CopyData(InputData: FansNekoNeko<out Any>, OutputData: FansNekoNeko<Any>){

        OutputData.Input = InputData.Input

    }

    val ShiroP2 : FansNekoNeko<Any> = FansNekoNeko("Data 2")

    // Print Dulu
    println(ShiroNeko.Input)
    println(ShiroP2.Input)
    println()
    
    // Jadi Step Awal Bisa Dilakukan
    CopyData(ShiroNeko, ShiroP2)
    
    // Hasil Akhir
    println(ShiroNeko.Input)
    println(ShiroP2.Input)

}