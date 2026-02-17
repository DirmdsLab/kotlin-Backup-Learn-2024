data class LoginP(var UserName: String, var Pw: String)
typealias VerivikasiLogin = (LoginP) -> Boolean

fun VerivikasiLoginValid(InputInfo: LoginP, InputStatus: VerivikasiLogin) : Boolean {
    return InputStatus(InputInfo)
}

fun main(){

    var Shiro = LoginP("Shiro","Loginnnnn")
    var Valid = VerivikasiLoginValid(Shiro) { (UserName,Pw) -> 
        UserName == "Shiro" && Pw == "Loginnnnn"
    }

    println(Valid)


}