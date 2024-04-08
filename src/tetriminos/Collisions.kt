package tetriminos

import draw.Grid.Companion.GRID_HEIGHT
import draw.Grid.Companion.GRID_WIDTH
import draw.Grid.Companion.GRID_X
import draw.Grid.Companion.GRID_Y
import draw.Tetriminoes.Companion.MINO_SIZE

object Collision {
    fun leftCollide(tetrimino: Tetrimino): Boolean {
        for ((x, _) in tetrimino.tetriminoCoordinates) {
            val leftX = x - 1
            if (GRID_X + leftX * MINO_SIZE <= GRID_X) {
                return true
            }
        }
        return false
    }
    fun rightCollide(tetrimino: Tetrimino): Boolean {
        for ((x, _) in tetrimino.tetriminoCoordinates) {
            val rightX = x + 1
            if (GRID_X + rightX * MINO_SIZE > GRID_X + GRID_WIDTH) {
                return true
            }
        }
        return false
    }
    fun downCollide(tetrimino: Tetrimino): Boolean {
        for ((_, y) in tetrimino.tetriminoCoordinates) {
            if (GRID_HEIGHT + GRID_Y - y * MINO_SIZE > GRID_HEIGHT) {
                return true
            }
        }
        return false
    }
}