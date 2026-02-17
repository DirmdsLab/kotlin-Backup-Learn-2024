class KetikaSedangMalas<in T> {

     fun HelloNolep(Input: T){
               return println("Hai $Input")
          }


     }


fun main(){

     val Shiro: KetikaSedangMalas<Any> = KetikaSedangMalas()
     val ShiroP2: KetikaSedangMalas<String> = Shiro

     ShiroP2.HelloNolep("Shiro Neko")

     }