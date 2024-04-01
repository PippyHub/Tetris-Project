package draw

import tetrominoes.*
import tetrominoes.Tetromino
import java.awt.Color
import java.awt.Graphics
class Tetrominoes(g: Graphics?) {
    private val minoSize = Grid.WIDTH / 10
    companion object {
        private var currentTetromino: Tetromino? = null
        fun setTetromino(tetromino: Tetromino) {
            currentTetromino = tetromino
        }
        fun getCurrentTetromino(): Tetromino? {
            return currentTetromino
        }
    }
    init {
        g?.color = getCurrentTetromino()?.let { getColor(it) }
        if(g?.color != null) {
            g.fillRoundRect(Grid.GRID_X, Grid.GRID_Y, minoSize, minoSize, 10, 10)
        }
    }
    private fun getColor(tetromino: Tetromino): Color? {
        return when (tetromino) {
            is I -> Color.CYAN
            is J -> Color.BLUE
            is L -> Color.ORANGE
            is O -> Color.YELLOW
            is S -> Color.GREEN
            is T -> Color.MAGENTA
            is Z -> Color.RED
            else -> null
        }
    }
}