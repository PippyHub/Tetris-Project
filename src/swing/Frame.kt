package swing

import java.awt.Dimension
import javax.swing.JFrame
class Frame : JFrame() {
    private val boardWidth = Panel.BOARD_WIDTH
    private val boardHeight = Panel.BOARD_HEIGHT
    private val panel = Panel()
    init {
        frame()
    }
    private fun frame() {
        title = "tetris"
        contentPane.preferredSize = Dimension(boardWidth, boardHeight)
        defaultCloseOperation = EXIT_ON_CLOSE
        add(panel)
        pack()
        setLocationRelativeTo(null)
        isResizable = false
        isVisible = true
    }
}