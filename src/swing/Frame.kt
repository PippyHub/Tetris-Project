package swing

import java.awt.Dimension
import javax.swing.JFrame
private class Frame: JFrame() {
    val boardWidth = Panel.BOARD_WIDTH
    val boardHeight = Panel.BOARD_HEIGHT
    val panel = Panel()
    init {
        frame()
    }
    private fun frame() {
        title = "tetris"
        contentPane.preferredSize = Dimension(boardWidth, boardHeight)
        defaultCloseOperation = EXIT_ON_CLOSE
        add(panel)
        panel.requestFocus()
        pack()
        setLocationRelativeTo(null)
        isResizable = false
        isVisible = true
    }
}
fun createFrame() {
    Frame()
}