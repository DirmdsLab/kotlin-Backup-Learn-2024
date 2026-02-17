open class Pen(var InputNamePen: String){

    open fun PrintDataPen(){
        println("Name Produk : ${this.InputNamePen}")
    }

}


class OSPen(var InputName: String, var InputOs: String): Pen(InputName){
    override fun PrintDataPen(){
        super.PrintDataPen()
        println("OS          : $InputOs")
    }
}


fun main(){

    var NekoTap = OSPen("NekoTap", "Android")
    NekoTap.PrintDataPen()


}