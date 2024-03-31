package swing

import gui.Background
import gui.Grid
import input.KeyInput
import input.MouseInput
import main.Event
import tetrominoes.Generator.generate

import java.awt.Graphics
import javax.swing.JPanel
class Panel: JPanel() {
    companion object {
        const val BOARD_WIDTH = 800
        const val BOARD_HEIGHT = 600
    }
    init {
        isFocusable = true
        addKeyListener(KeyInput())
        addMouseListener(MouseInput())
        Event()

        val tetromino = generate()
        print(tetromino.name)
    }
    override fun paintComponent(g: Graphics?) {
        super.paintComponent(g)
        Background(g)
        Grid(g)
    }
}