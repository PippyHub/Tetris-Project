package input

import swing.Panel
import tetriminos.Tetrimino.Companion.getTetrimino
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
class KeyInput(private var panel: Panel) : KeyListener {
    private var tetriminoX = 0;
    override fun keyTyped(e: KeyEvent?) {
    }
    override fun keyPressed(e: KeyEvent?) {
        val tetrimino = getTetrimino()
        tetriminoX = tetrimino?.getX()!!
        e?.let {
            when (it.keyCode) {
                KeyEvent.VK_LEFT -> {
                    tetriminoX -= 1
                    tetrimino.setX(tetriminoX)
                }
                KeyEvent.VK_RIGHT -> {
                    tetriminoX += 1
                    tetrimino.setX(tetriminoX)
                }
                KeyEvent.VK_UP -> {
                    TODO("Implement rotation 90 degrees clockwise")
                }
                KeyEvent.VK_DOWN -> {
                    TODO("Implement non-locking soft drop")
                }
                KeyEvent.VK_SPACE -> {
                    TODO("Implement locking hard drop")
                }
                KeyEvent.VK_C, KeyEvent.VK_SHIFT -> {
                    TODO("Implement hold piece functionality")
                }
                KeyEvent.VK_Z, KeyEvent.VK_CONTROL -> {
                    TODO("Implement rotation 90 degrees counterclockwise")
                }
                else -> {}
            }
        }
    }
    override fun keyReleased(e: KeyEvent?) {
    }
}