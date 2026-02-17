data class InputItemGame(val TotalTypeItem: Int){

    operator fun plus(UserTotalInput: InputItemGame) : InputItemGame {

        return InputItemGame(TotalTypeItem + UserTotalInput.TotalTypeItem)

    }

}


fun main(){

    var InputUser = InputItemGame(50) + InputItemGame(20)
    println("Total Item : ${InputUser.TotalTypeItem}")

}