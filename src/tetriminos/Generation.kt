package tetriminos

object Generation {
    fun sevenBag(): MutableList<Tetriminos> {
        val list = mutableListOf(I(), J(), L(), O(), S(), T(), Z())
        val shuffledList = list.shuffled().toMutableList()
        return shuffledList
    }
}