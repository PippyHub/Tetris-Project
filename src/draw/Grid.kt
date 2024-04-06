package draw

import swing.Panel
import java.awt.Color
import java.awt.Graphics
class Grid(g: Graphics?) {
    companion object {
        const val WIDTH = 270
        const val HEIGHT = WIDTH * 2
        const val GRID_X = Panel.BOARD_WIDTH / 2 - WIDTH / 2
        const val GRID_Y = Panel.BOARD_HEIGHT / 2 - HEIGHT / 2
    }
    init {
        g?.color = Color(0,0,0,160)
        g?.fillRoundRect(GRID_X, GRID_Y, WIDTH, HEIGHT,10,10)
    }
}