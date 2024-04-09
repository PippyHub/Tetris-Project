package tetriminos

object Drop {
    fun softDrop() {

    }
    fun hardDrop(tetriminos: Tetriminos) {
        tetriminos.setY(2)
    }
}