package draw

import swing.Panel
import java.awt.Color
import java.awt.Graphics
class Grid(g: Graphics?) {
    companion object {
        const val GRID_WIDTH = 270
        const val GRID_HEIGHT = GRID_WIDTH * 2
        const val GRID_X = Panel.BOARD_WIDTH / 2 - GRID_WIDTH / 2
        const val GRID_Y = Panel.BOARD_HEIGHT / 2 - GRID_HEIGHT / 2
    }
    init {
        g?.color = Color(0,0,0,160)
        g?.fillRoundRect(GRID_X, GRID_Y, GRID_WIDTH, GRID_HEIGHT,10,10)
    }
}