package draw

import tetriminos.*
import tetriminos.Tetrimino.Companion.getTetrimino
import java.awt.Color
import java.awt.Graphics
class Tetriminoes(g: Graphics?) {
    private val minoSize = Grid.WIDTH / 10
    init {
        val tetrimino = getTetrimino()
        g?.color = tetrimino?.let { getColor(it) }
        tetrimino?.let {
            for ((x, y) in it.tetrominoCoordinates) {
                g?.fillRoundRect(
                    Grid.GRID_X + (x - 1) * minoSize,
                    Grid.HEIGHT + Grid.GRID_Y - y *  minoSize,
                    minoSize,
                    minoSize,
                    10,
                    10
                )
            }
        }
    }
    private fun getColor(tetrimino: Tetrimino): Color {
        return when (tetrimino) {
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