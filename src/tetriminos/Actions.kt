package tetriminos

import tetriminos.Tetrimino.Orientation
interface Rotatable {
    fun rotateClockwise(orientation: Orientation): Orientation {
        return when (orientation) {
            Orientation.UPPER_HORIZONTAL -> Orientation.RIGHT_VERTICAL
            Orientation.RIGHT_VERTICAL -> Orientation.LOWER_HORIZONTAL
            Orientation.LOWER_HORIZONTAL -> Orientation.LEFT_VERTICAL
            Orientation.LEFT_VERTICAL -> Orientation.UPPER_HORIZONTAL
        }
    }
    fun rotateAntiClockwise(orientation: Orientation): Orientation {
        return when (orientation) {
            Orientation.LEFT_VERTICAL -> Orientation.LOWER_HORIZONTAL
            Orientation.LOWER_HORIZONTAL -> Orientation.RIGHT_VERTICAL
            Orientation.RIGHT_VERTICAL -> Orientation.UPPER_HORIZONTAL
            Orientation.UPPER_HORIZONTAL -> Orientation.LEFT_VERTICAL
        }
    }
}
open class Actions {
    fun softDrop() {
    }
    fun hardDrop() {
    }
}