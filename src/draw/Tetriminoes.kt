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
        if(tetrimino != null) {
            g?.fillRoundRect(
                Grid.GRID_X + tetrimino.getX() * minoSize,
                Grid.GRID_Y + tetrimino.getY() * minoSize,
                minoSize,
                minoSize,
                10,
                10
            )
        }
    }
    private fun getColor(tetrimino: Tetrimino): Color {
        return when (tetrimino) {
            is I -> Color.CYAN
            is J -> Color.BLUE
            is L -> Color.ORANGE
            is O -> Color.YELLOW
            is S -> Color.GREEN
            is T -> Color.MAGENTA
            is Z -> Color.RED
            else -> Color.WHITE
        }
    }
}