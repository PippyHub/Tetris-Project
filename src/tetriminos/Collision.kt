package tetriminos

import draw.Grid.Companion.GRID_WIDTH
import draw.Grid.Companion.GRID_X
import draw.Tetriminoes.Companion.MINO_SIZE

object Collision {
    fun leftCollide(tetrimino: Tetrimino): Boolean {
        for ((x, _) in tetrimino.tetrominoCoordinates) {
            val leftX = x - 1
            if (GRID_X + leftX * MINO_SIZE <= GRID_X) {
                return true
            }
        }
        return false
    }
    fun rightCollide(tetrimino: Tetrimino): Boolean {
        for ((x, _) in tetrimino.tetrominoCoordinates) {
            val rightX = x + 1
            if (GRID_X + rightX * MINO_SIZE > GRID_X + GRID_WIDTH) {
                return true
            }
        }
        return false
    }
    fun downCollide(tetrimino: Tetrimino): Boolean {
        return false
    }
}