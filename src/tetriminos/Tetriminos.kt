package tetriminos
open class Tetriminos {
    companion object {
        private var currentTetriminos: Tetriminos? = null
        private var place: ArrayList<Tetriminos>? = ArrayList()
        fun getTetriminos(): Tetriminos? {
            return currentTetriminos
        }
        fun getPlace(): ArrayList<Tetriminos>? {
            return place
        }
    }
    enum class Orientation {
        UPPER_HORIZONTAL,
        RIGHT_VERTICAL,
        LOWER_HORIZONTAL,
        LEFT_VERTICAL
    }
    var orientation: Orientation = Orientation.UPPER_HORIZONTAL
    var tetriminoCoordinates: Array<Pair<Int, Int>> = emptyArray()
    private var minoX = 4
    private var minoY = 20
    open fun setTetriminos() {
        currentTetriminos = this
    }
    fun setPlace() {
        place?.add(this)
    }
    open fun setCoordinates() {}
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
}