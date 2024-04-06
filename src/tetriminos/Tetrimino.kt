package tetriminos

import kotlin.random.Random
object Generator {
    private val tetrominoClasses = listOf(
        I(), J(), L(), O(), S(), T(), Z()
    )
    fun generate(): Tetrimino {
        val randomIndex = Random.nextInt(0, tetrominoClasses.size)
        return tetrominoClasses[randomIndex]
    }
}
interface Rotatable {
    fun rotate()
}
open class Tetrimino {
    companion object {
        private var currentTetrimino: Tetrimino? = null
        fun setTetrimino(tetrimino: Tetrimino) {
            currentTetrimino = tetrimino
        }
        fun getTetrimino(): Tetrimino? {
            return currentTetrimino
        }
    }
    open var minoX = 0
    open var minoY = 0
    open var tetrominoX = IntArray(4) { 0 }
    open var tetrominoY = IntArray(4) { 0 }
    fun setX(x: Int) {
        minoX = x
    }
    fun setY(y: Int) {
        minoY = y
    }
    fun getX(): Int {
        return minoX
    }
    fun getY(): Int {
        return minoY
    }
}
class I: Tetrimino(), Rotatable {
    init {
        tetrominoX = IntArray(4) { minoX }
    }
    override fun rotate() {
    }
}
class J: Tetrimino(), Rotatable {
    init {
        tetrominoX = intArrayOf(minoY,minoX,minoX,minoX)
    }
    override fun rotate() {
    }
}
class L: Tetrimino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class O: Tetrimino() {
    init {
    }
}
class S: Tetrimino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class T: Tetrimino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class Z: Tetrimino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}