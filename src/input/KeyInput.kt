package input

import swing.Panel
import tetriminos.Rotatable
import tetriminos.Collision.leftCollide
import tetriminos.Collision.rightCollide
import tetriminos.Tetrimino
import tetriminos.Tetrimino.Companion.getTetrimino
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
class KeyInput(private var panel: Panel) : KeyListener {
    private var tetriminoX = 0;
    override fun keyTyped(e: KeyEvent?) {
    }
    override fun keyPressed(e: KeyEvent?) {
        val tetrimino: Tetrimino = getTetrimino() ?: return
        tetriminoX = tetrimino.getX()
        e?.let {
            when (it.keyCode) {
                KeyEvent.VK_LEFT -> {
                    if (leftCollide(tetrimino)) return
                    tetriminoX -= 1
                    tetrimino.setX(tetriminoX)
                    tetrimino.setCoordinates()
                }
                KeyEvent.VK_RIGHT -> {
                    if (rightCollide(tetrimino)) return
                    tetriminoX += 1
                    tetrimino.setX(tetriminoX)
                    tetrimino.setCoordinates()
                }
                KeyEvent.VK_UP -> {
                    if (tetrimino is Rotatable) {
                        tetrimino.rotateThisClockwise()
                    }
                    tetrimino.setCoordinates()
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
                    if (tetrimino is Rotatable) {
                        tetrimino.rotateThisAntiClockwise()
                    }
                    tetrimino.setCoordinates()
                }
                else -> {}
            }
        }
    }
    override fun keyReleased(e: KeyEvent?) {
    }
}