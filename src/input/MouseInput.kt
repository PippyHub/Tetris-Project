package input

import swing.Panel
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener
class MouseInput(private var panel: Panel) : MouseListener, MouseMotionListener {
    private var running = false
    override fun mouseClicked(e: MouseEvent?) {
        if (e?.button == MouseEvent.BUTTON1) {
            if (!running) {
                panel.updateHandler.start()
                running = true
            }
        } else if (e?.button == MouseEvent.BUTTON3) {
            if (running) {
                panel.updateHandler.stop()
                running = false
            }
        }
    }
    override fun mousePressed(e: MouseEvent?) {
    }
    override fun mouseReleased(e: MouseEvent?) {
    }
    override fun mouseEntered(e: MouseEvent?) {
    }
    override fun mouseExited(e: MouseEvent?) {
    }
    override fun mouseDragged(e: MouseEvent?) {
    }
    override fun mouseMoved(e: MouseEvent?) {
    }
}