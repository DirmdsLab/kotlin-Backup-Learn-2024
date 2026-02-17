class NekoSukii (var NameNeko: String)

fun NekoSukii.PrintExt(){

    println("Print Dari Ext : ${NameNeko}")

}

fun NekoSukii.PrintExtP2(NameNeko: String) {

    println("Saya Nama Baru : ${NameNeko} Dan Saya Original : ${this.NameNeko}")

}

// ternyata input kagak ngaruh :v 

fun NekoSukii.PrintExtP3(InputRandom: String) {

    println("Input Random : ${InputRandom} Nama Original : ${NameNeko}")

}

fun main(){

    var Shiro = NekoSukii("Shiro")

    println("Print Biasa : ${Shiro.NameNeko}")
    
    Shiro.PrintExt()

    Shiro.PrintExtP2("Shiro Neko")

    Shiro.PrintExtP3("Hmph")

}

// Ingan Extension tidak di anggap di kelas T_T :v