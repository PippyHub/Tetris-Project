package input

import swing.Panel
import tetriminos.Rotatable
import tetriminos.Collision.leftCollide
import tetriminos.Collision.rightCollide
import tetriminos.Place
import tetriminos.Tetriminos
import tetriminos.Tetriminos.Companion.getTetrimino
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
class KeyInput(private var panel: Panel) : KeyListener {
    private var tetriminoX = 0
    override fun keyTyped(e: KeyEvent?) {
    }
    override fun keyPressed(e: KeyEvent?) {
        val tetriminos: Tetriminos = getTetrimino() ?: return
        tetriminoX = tetriminos.getX()
        e?.let {
            when (it.keyCode) {
                KeyEvent.VK_LEFT -> {
                    if (leftCollide(tetriminos)) return
                    tetriminoX -= 1
                    tetriminos.setX(tetriminoX)
                    tetriminos.setCoordinates()
                }
                KeyEvent.VK_RIGHT -> {
                    if (rightCollide(tetriminos)) return
                    tetriminoX += 1
                    tetriminos.setX(tetriminoX)
                    tetriminos.setCoordinates()
                }
                KeyEvent.VK_UP -> {
                    if (tetriminos is Rotatable) {
                        tetriminos.rotateClockwise()
                    }
                    tetriminos.setCoordinates()
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
                    if (tetriminos is Rotatable) {
                        tetriminos.rotateAntiClockwise()
                    }
                    tetriminos.setCoordinates()
                }
                else -> {}
            }
        }
    }
    override fun keyReleased(e: KeyEvent?) {
    }
}