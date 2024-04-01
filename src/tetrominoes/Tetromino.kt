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
    lateinit var name: String
}
class I: Tetromino(), Rotatable {
    init {
        name = "I"
    }
    override fun rotate() {
    }
}
class J: Tetromino(), Rotatable {
    init {
        name = "J"
    }
    override fun rotate() {
    }
}
class L: Tetromino(), Rotatable {
    init {
        name = "L"
    }
    override fun rotate() {
    }
}
class O: Tetromino() {
}
class S: Tetromino(), Rotatable {
    init {
        name = "O"
    }
    override fun rotate() {
    }
}
class T: Tetromino(), Rotatable {
    init {
        name = "S"
    }
    override fun rotate() {
    }
}
class Z: Tetromino(), Rotatable {
    init {
        name = "T"
    }
    override fun rotate() {
    }
}