package draw

import tetriminos.*
import tetriminos.Tetriminos
import tetriminos.Tetriminos.Companion.getTetrimino
import java.awt.Color
import java.awt.Graphics
class Tetrimino(g: Graphics?) {
    companion object {
        const val MINO_SIZE = Grid.GRID_WIDTH / 10
    }
    init {
        fallingTetrimino(getTetrimino(), g)
        placedTetrimino(g)
    }
    private fun fallingTetrimino(tetriminos: Tetriminos?, g: Graphics?) {
        g?.color = tetriminos?.let { getColor(it) }
        tetriminos?.let {
            for ((x, y) in it.tetriminoCoordinates) {
                g?.fillRoundRect(
                    Grid.GRID_X + (x - 1) * MINO_SIZE,
                    Grid.GRID_HEIGHT + Grid.GRID_Y - y *  MINO_SIZE,
                    MINO_SIZE,
                    MINO_SIZE,
                    10,
                    10
                )
            }
        }
    }
    private fun placedTetrimino(g: Graphics?) {
    }
    private fun getColor(tetriminos: Tetriminos): Color {
        return when (tetriminos) {
            is I -> Color(0f, 1f, 1f, 0.5f)
            is J -> Color(0f, 0f, 1f, 0.5f)
            is L -> Color(1f, 0.5f, 0f, 0.5f)
            is O -> Color(1f, 1f, 0f, 0.5f)
            is S -> Color(0f, 1f, 0f, 0.5f)
            is T -> Color(1f, 0f, 1f, 0.5f)
            is Z -> Color(1f, 0f, 0f, 0.5f)
            else -> Color(1f, 1f, 1f, 0.5f)
        }
    }
}