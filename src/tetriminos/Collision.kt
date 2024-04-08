package tetriminos

import draw.Grid.Companion.GRID_HEIGHT
import draw.Grid.Companion.GRID_WIDTH
import draw.Grid.Companion.GRID_X
import draw.Grid.Companion.GRID_Y
import draw.Tetrimino.Companion.MINO_SIZE

object Collision {
    fun leftCollide(tetriminos: Tetriminos): Boolean {
        for ((x, _) in tetriminos.tetriminoCoordinates) {
            val leftX = x - 1
            if (GRID_X + leftX * MINO_SIZE <= GRID_X) {
                return true
            }
        }
        return false
    }
    fun rightCollide(tetriminos: Tetriminos): Boolean {
        for ((x, _) in tetriminos.tetriminoCoordinates) {
            val rightX = x + 1
            if (GRID_X + rightX * MINO_SIZE > GRID_X + GRID_WIDTH) {
                return true
            }
        }
        return false
    }
    fun downCollide(tetriminos: Tetriminos): Boolean {
        for ((_, y) in tetriminos.tetriminoCoordinates) {
            if (GRID_HEIGHT + GRID_Y - y * MINO_SIZE > GRID_HEIGHT) {
                return true
            }
        }
        return false
    }
}