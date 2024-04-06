package tetriminos

import kotlin.random.Random

object Generator {
    private val tetrominoClasses = listOf(I(), J(), L(), O(), S(), T(), Z())

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
    private var minoX = 0
    private var minoY = 0
    var tetrominoCoordinates: Array<Pair<Int, Int>> = emptyArray()
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
    open fun setCoordinates() {}
}
class I : Tetrimino(), Rotatable {
    init {
        setX(3)
        setY(0)
    }
    override fun setCoordinates() {
        tetrominoCoordinates = arrayOf(
            Pair(getX(), getY()),
            Pair(getX() + 1, getY()),
            Pair(getX() + 2, getY()),
            Pair(getX() + 3, getY())
        )
    }
    override fun rotate() {
    }
}
class J : Tetrimino(), Rotatable {
    init {
        setX(3)
        setY(0)
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = arrayOf(
            Pair(getX(), getY()),
            Pair(getX(), getY() + 1),
            Pair(getX(), getY() + 2),
            Pair(getX() + 1, getY() + 2)
        )
    }
    override fun rotate() {
    }
}

class L: Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
    }
    override fun rotate() {
    }
}
class O: Tetrimino() {
    init {
        setX(3)
        setY(0)
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = arrayOf(
            Pair(getX(), getY()),
            Pair(getX() + 1, getY()),
            Pair(getX(), getY() + 1),
            Pair(getX() + 1, getY() + 1)
        )
    }
}
class S: Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
    }
    override fun rotate() {
    }
}
class T: Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
    }
    override fun rotate() {
    }
}
class Z: Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
    }
    override fun rotate() {
    }
}