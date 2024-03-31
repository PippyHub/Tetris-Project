    package gui

    import java.awt.Graphics
    import java.awt.Image
    import javax.swing.ImageIcon
    class Background(g: Graphics?) {
        private val backgroundImage: Image? = ImageIcon("src/gui/assets/Gate.png").image
        init {
            g?.drawImage(backgroundImage, 0, 0, null)
        }
    }
