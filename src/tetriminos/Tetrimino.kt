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
    fun rotateClockwise()
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
    enum class Orientation {
        UPPER_HORIZONTAL,
        RIGHT_VERTICAL,
        LOWER_HORIZONTAL,
        LEFT_VERTICAL
    }
    protected var orientation = Orientation.UPPER_HORIZONTAL
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
    fun rotateThisClockwise() {
        orientation = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> Orientation.RIGHT_VERTICAL
            Orientation.RIGHT_VERTICAL -> Orientation.LOWER_HORIZONTAL
            Orientation.LOWER_HORIZONTAL -> Orientation.LEFT_VERTICAL
            Orientation.LEFT_VERTICAL -> Orientation.UPPER_HORIZONTAL
        }
        setCoordinates()
    }
}
class I : Tetrimino(), Rotatable {
    init {
        setX(3)
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX() + 1, getY()),
                Pair(getX() + 2, getY()),
                Pair(getX() + 3, getY())
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 2, getY() - 1),
                Pair(getX() + 2, getY()),
                Pair(getX() + 2, getY() + 1),
                Pair(getX() + 2, getY() + 2)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 2, getY() + 1),
                Pair(getX() + 3, getY() + 1)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 1, getY() + 2)
            )
        }
    }
    override fun rotateClockwise() {
        rotateThisClockwise()
    }
}
class J : Tetrimino(), Rotatable {
    init {
        setX(3)
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 1),
                Pair(getX(), getY()),
                Pair(getX() + 1, getY()),
                Pair(getX() + 2, getY())
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX(), getY()),
                Pair(getX(), getY()),
                Pair(getX(), getY()),
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX(), getY()),
                Pair(getX(), getY()),
                Pair(getX(), getY()),
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX(), getY()),
                Pair(getX(), getY()),
                Pair(getX(), getY()),
            )
        }
    }
    override fun rotateClockwise() {
        rotateThisClockwise()
    }
}
class L : Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() + 2),
                Pair(getX() + 1, getY() + 2),
                Pair(getX() + 2, getY() + 2),
                Pair(getX() + 2, getY() + 1)
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 1, getY() + 2),
                Pair(getX(), getY() + 2)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX() + 2, getY()),
                Pair(getX() + 1, getY()),
                Pair(getX(), getY()),
                Pair(getX(), getY() + 1)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX(), getY() + 1),
                Pair(getX(), getY() + 2),
                Pair(getX() + 1, getY() + 2)
            )
        }
    }
    override fun rotateClockwise() {
        rotateThisClockwise()
    }
}
class O : Tetrimino() {
    init {
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
class S : Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 2, getY()),
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY() + 1)
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 1, getY() + 2)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 2, getY() + 1),
                Pair(getX(), getY() + 2),
                Pair(getX() + 1, getY() + 2)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 2, getY() + 1),
                Pair(getX() + 2, getY() + 2)
            )
        }
    }
    override fun rotateClockwise() {
        rotateThisClockwise()
    }
}
class T : Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 2, getY() + 1)
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 1, getY() + 2)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 2, getY())
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX() + 2, getY()),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 2, getY() + 1),
                Pair(getX() + 2, getY() + 2)
            )
        }
    }
    override fun rotateClockwise() {
        rotateThisClockwise()
    }
}
class Z : Tetrimino(), Rotatable {
    init {
        setCoordinates()
    }
    override fun setCoordinates() {
        tetrominoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 2, getY() + 1)
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY() + 1),
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY()),
                Pair(getX() + 2, getY())
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX() + 2, getY()),
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() + 1),
                Pair(getX(), getY() + 1)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX(), getY() + 2),
                Pair(getX(), getY() + 1),
                Pair(getX() + 1, getY() + 1),
                Pair(getX() + 1, getY())
            )
        }
    }
    override fun rotateClockwise() {
        rotateThisClockwise()
    }
}