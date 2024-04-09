package tetriminos
open class Tetriminos : Drop(), Place {
    private lateinit var _place: ArrayList<Tetriminos>
    override var place: ArrayList<Tetriminos>
        get() = _place
        set(value) {
            _place = value
        }
    companion object {
        private var currentTetriminos: Tetriminos? = null
        fun setTetrimino(tetriminos: Tetriminos) {
            currentTetriminos = tetriminos
        }
        fun getTetrimino(): Tetriminos? {
            return currentTetriminos
        }
    }
    enum class Orientation {
        UPPER_HORIZONTAL,
        RIGHT_VERTICAL,
        LOWER_HORIZONTAL,
        LEFT_VERTICAL
    }
    var orientation: Orientation = Orientation.UPPER_HORIZONTAL
    private var minoX = 4
    private var minoY = 21
    var tetriminoCoordinates: Array<Pair<Int, Int>> = emptyArray()
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
    open fun rotateThisClockwise() {}
    open fun rotateThisAntiClockwise() {}
}
class I : Tetriminos(), Rotatable {
    override fun setCoordinates() {
        tetriminoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1),
                Pair(getX() + 3, getY() - 1)
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 2, getY()),
                Pair(getX() + 2, getY() - 1),
                Pair(getX() + 2, getY() - 2),
                Pair(getX() + 2, getY() - 3)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 2),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 2, getY() - 2),
                Pair(getX() + 3, getY() - 2)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 1, getY() - 3)
            )
        }
    }
    override fun rotateThisClockwise() {
        orientation = rotateClockwise(orientation)
    }
    override fun rotateThisAntiClockwise() {
        orientation = rotateAntiClockwise(orientation)
    }
}
class J : Tetriminos(), Rotatable {
    override fun setCoordinates() {
        tetriminoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1)
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 2, getY())
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX() + 2, getY() - 2),
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX(), getY() - 2)
            )
        }
    }
    override fun rotateThisClockwise() {
        orientation = rotateClockwise(orientation)
    }
    override fun rotateThisAntiClockwise() {
        orientation = rotateAntiClockwise(orientation)
    }
}
class L : Tetriminos(), Rotatable {
    
    override fun setCoordinates() {
        tetriminoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX() + 2, getY()),
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1)
            )

            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 2, getY() - 2)
            )

            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 2),
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1)
            )

            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX(), getY())
            )
        }
    }
    override fun rotateThisClockwise() {
        orientation = rotateClockwise(orientation)
    }
    override fun rotateThisAntiClockwise() {
        orientation = rotateAntiClockwise(orientation)
    }
}
class O : Tetriminos() {
    override fun setCoordinates() {
        tetriminoCoordinates = arrayOf(
            Pair(getX() + 1, getY()),
            Pair(getX() + 2, getY()),
            Pair(getX() + 1, getY() - 1),
            Pair(getX() + 2, getY() - 1)
        )
    }
}
class S : Tetriminos(), Rotatable {
    override fun setCoordinates() {
        tetriminoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY()),
                Pair(getX() + 2, getY())
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1 , getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1),
                Pair(getX() + 2, getY() - 2)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 2),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2)
            )
        }
    }
    override fun rotateThisClockwise() {
        orientation = rotateClockwise(orientation)
    }
    override fun rotateThisAntiClockwise() {
        orientation = rotateAntiClockwise(orientation)
    }
}
class T : Tetriminos(), Rotatable {
    override fun setCoordinates() {
        tetriminoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1),
                Pair(getX() + 1, getY())
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 2, getY() - 1)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1),
                Pair(getX() + 1, getY() - 2)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX(), getY() - 1)
            )
        }
    }
    override fun rotateThisClockwise() {
        orientation = rotateClockwise(orientation)
    }
    override fun rotateThisAntiClockwise() {
        orientation = rotateAntiClockwise(orientation)
    }
}
class Z : Tetriminos(), Rotatable {
    override fun setCoordinates() {
        tetriminoCoordinates = when (orientation) {
            Orientation.UPPER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY()),
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 2, getY() - 1)
            )
            Orientation.RIGHT_VERTICAL -> arrayOf(
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 2, getY()),
                Pair(getX() + 2, getY() - 1)
            )
            Orientation.LOWER_HORIZONTAL -> arrayOf(
                Pair(getX(), getY() - 1),
                Pair(getX() + 1, getY() - 1),
                Pair(getX() + 1, getY() - 2),
                Pair(getX() + 2, getY() - 2)
            )
            Orientation.LEFT_VERTICAL -> arrayOf(
                Pair(getX(), getY() - 1),
                Pair(getX(), getY() - 2),
                Pair(getX() + 1, getY()),
                Pair(getX() + 1, getY() - 1)
            )
        }
    }
    override fun rotateThisClockwise() {
        orientation = rotateClockwise(orientation)
    }
    override fun rotateThisAntiClockwise() {
        orientation = rotateAntiClockwise(orientation)
    }
}