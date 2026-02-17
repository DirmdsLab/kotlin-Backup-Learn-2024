// Perbandingan Tampa Override Equals 
// IF
class TampaOverIf(val Input: String)

class PakaiOverIf(val Input: String){

    override fun equals(other: Any?): Boolean{

        return if(other is PakaiOverIf){
            Input == other.Input
        } else {
            false
        }

    }

}

// When

class TampaOverWhen(val Input: String)

class PakaiOverWhen(val Input: String){

    override fun equals(other: Any?): Boolean {

        return when(other){
            is PakaiOverWhen -> Input == other.Input
            else -> false
        }

    }

}


fun main(){

    // Part 1 Tampa
    val Part1Tampa1 = TampaOverIf("Hmph")
    val Part1Tampa2 = TampaOverIf("Hmph")

    println("Part Tampa Over\n${Part1Tampa1 == Part1Tampa2}\n")
    
    // Part 2 Pakai
    val Part2_1 = PakaiOverIf("Hmph")
    val Part2_2 = PakaiOverIf("Hmph")
    
    println("Part Over\n${Part2_1 == Part2_2}\n")

    println()
    // Extra Part 1
    val ExtraPart1Tampa1 = TampaOverWhen("Shiranai")
    val ExtraPart1Tampa2 = TampaOverWhen("Shiranai")

    println("Perbandingan Extra Tampa\n${ExtraPart1Tampa1 == ExtraPart1Tampa2}")

    // Extra Part 2
    val ExtraPart2_1 = PakaiOverWhen("Shiranai")
    val ExtraPart2_2 = PakaiOverWhen("Shiranai")

    println("Perbandingan Extra Pakai\n${ExtraPart2_1 == ExtraPart2_2}")

}