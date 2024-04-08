package swing

import draw.Background
import draw.Grid
import draw.Tetrimino
import game.Game
import input.KeyInput
import input.MouseInput
import gameloop.EventHandler
import gameloop.FrameHandler

import java.awt.Graphics
import javax.swing.JPanel
class Panel : JPanel() {
    companion object {
        const val BOARD_WIDTH = 800
        const val BOARD_HEIGHT = 600
    }
    val frameHandler = FrameHandler(this)
    val eventHandler = EventHandler(this)
    private val game = Game()
    init {
        isFocusable = true
        addKeyListener(KeyInput(this))
        addMouseListener(MouseInput(this))
    }
    fun update(deltaUpdate: Double) {
        game.update(deltaUpdate)
    }
    override fun paintComponent(g: Graphics?) {
        super.paintComponent(g)
        Background(g)
        Grid(g)
        Tetrimino(g)
    }
}