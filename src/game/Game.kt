package game

import tetriminos.Generator.sevenBag
import tetriminos.Tetrimino
import tetriminos.Tetrimino.Companion.setTetrimino

class Game {
    enum class GameState {
        NOT_PLAYING,
        GENERATING,
        DROPPING,
        GAME_OVER
    }
    private var state: GameState = GameState.NOT_PLAYING
    private lateinit var tetrimino: Tetrimino
    private lateinit var bag: MutableList<Tetrimino>
    private var tetriminoY: Int = 0
    private var timeExists: Double = 0.0
    private var timeSimulated: Double = 0.0
    private var gravity = setGravity(0)
    init {
        bag = sevenBag()
    }
    fun update(deltaUpdate: Double) {
        timeExists += deltaUpdate
        when (state) {
            GameState.NOT_PLAYING -> state = GameState.GENERATING
            GameState.GENERATING -> generating()
            GameState.DROPPING -> dropping()
            GameState.GAME_OVER -> print("")
        }
    }
    private fun generating() {
        if (bag.isEmpty()) {
            bag = sevenBag()
            tetrimino = bag.first()
            bag.removeAt(0)

        } else {
            tetrimino = bag.first()
            bag.removeAt(0)
        }


        setTetrimino(tetrimino)
        tetriminoY = tetrimino.getY()
        state = GameState.DROPPING
    }
    private fun dropping() {
        if (timeExists > timeSimulated) {
            tetriminoY--
            timeSimulated += 1.0 / gravity
            tetrimino.setY(tetriminoY)
            tetrimino.setCoordinates()
        }
    }
    fun setGravity(level: Int): Double {
        val speedCurve = createSpeedCurve()
        return speedCurve[level] ?: 1.0
    }
    private fun createSpeedCurve(): Map<Int, Double> {
        val speeds = mapOf(
            0 to 0.0,
            1 to 0.01667,
            2 to 0.021017,
            3 to 0.026977,
            4 to 0.035256,
            5 to 0.04693,
            6 to 0.06361,
            7 to 0.0879,
            8 to 0.1236,
            9 to 0.1775,
            10 to 0.2598,
            11 to 0.388,
            12 to 0.59,
            13 to 0.92,
            14 to 1.46,
            15 to 2.36,
            16 to 3.91,
            17 to 6.61,
            18 to 11.43
        )
        val extraSpeeds = (19..25).map { it to 20.0 }
        return (speeds + extraSpeeds).toMap()
    }
}