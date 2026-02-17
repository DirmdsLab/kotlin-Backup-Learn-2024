data class KasihanKagakDiAjak(var Name: String, var Age: Int)


fun PenentuanDiajak(Input1: String, Input2: Int) : KasihanKagakDiAjak {

    return when {

        Input2 == 0 -> KasihanKagakDiAjak(Input1, 0)
        else -> KasihanKagakDiAjak(Input1, Input2)

    }

}

fun main(){

    // materi sebelumnya 
    var (Diajak, DiajakP2) = PenentuanDiajak("Shiro Neko", 17)
    println("Name : ${Diajak}")
    println("Age  : ${DiajakP2}")
    println()
    
    // Topic Hari Ini
    var (YangKeduaTidakDiAjak, _) = PenentuanDiajak("Kuro", 0)
    println("Name : ${YangKeduaTidakDiAjak}")
    // println("Age  : ${_}")
    // Kagak Diajak Soalnya :v
    println()
    
    

}