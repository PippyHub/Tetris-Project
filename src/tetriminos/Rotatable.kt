package tetriminos

interface Rotatable {
    fun rotateClockwise(orientation: Tetriminos.Orientation): Tetriminos.Orientation {
        return when (orientation) {
            Tetriminos.Orientation.UPPER_HORIZONTAL -> Tetriminos.Orientation.RIGHT_VERTICAL
            Tetriminos.Orientation.RIGHT_VERTICAL -> Tetriminos.Orientation.LOWER_HORIZONTAL
            Tetriminos.Orientation.LOWER_HORIZONTAL -> Tetriminos.Orientation.LEFT_VERTICAL
            Tetriminos.Orientation.LEFT_VERTICAL -> Tetriminos.Orientation.UPPER_HORIZONTAL
        }
    }
    fun rotateAntiClockwise(orientation: Tetriminos.Orientation): Tetriminos.Orientation {
        return when (orientation) {
            Tetriminos.Orientation.LEFT_VERTICAL -> Tetriminos.Orientation.LOWER_HORIZONTAL
            Tetriminos.Orientation.LOWER_HORIZONTAL -> Tetriminos.Orientation.RIGHT_VERTICAL
            Tetriminos.Orientation.RIGHT_VERTICAL -> Tetriminos.Orientation.UPPER_HORIZONTAL
            Tetriminos.Orientation.UPPER_HORIZONTAL -> Tetriminos.Orientation.LEFT_VERTICAL
        }
    }
}