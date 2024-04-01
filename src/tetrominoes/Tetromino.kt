package tetrominoes

import kotlin.random.Random
object Generator {
    private val tetrominoClasses = listOf(
        I(), J(), L(), O(), S(), T(), Z()
    )
    fun generate(): Tetromino {
        val randomIndex = Random.nextInt(0, tetrominoClasses.size)
        return tetrominoClasses[randomIndex]
    }
}
interface Rotatable {
    fun rotate()
}
open class Tetromino {
    val mino = 4
    var minoX = 4
    var minoY = 0
}
class I: Tetromino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class J: Tetromino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class L: Tetromino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class O: Tetromino() {
    init {
    }
}
class S: Tetromino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class T: Tetromino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}
class Z: Tetromino(), Rotatable {
    init {
    }
    override fun rotate() {
    }
}