package gui

import swing.Panel
import java.awt.Color
import java.awt.Graphics
class Grid(g: Graphics?) {
    private companion object {
        const val GRID_WIDTH = 270
        const val GRID_HEIGHT = 550
    }
    private val boardWidth = Panel.BOARD_WIDTH
    private val boardHeight = Panel.BOARD_HEIGHT

    private val gridWidthPad = boardWidth / 2 - GRID_WIDTH / 2
    private val gridHeightPad = boardHeight / 2 - GRID_HEIGHT / 2
    init {
        g?.color = Color(0,0,0,160)
        g?.fillRoundRect(gridWidthPad, gridHeightPad, GRID_WIDTH, GRID_HEIGHT,10,10)
    }
}