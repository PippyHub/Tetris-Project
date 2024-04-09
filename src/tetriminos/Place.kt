package tetriminos

interface Place {
    companion object {
        private var place: ArrayList<Tetriminos>? = ArrayList()
        fun getPlace(): ArrayList<Tetriminos>? {
            return place
        }
    }
    fun setPlace() {
        place?.add(this as Tetriminos)
    }
}
