package game

import draw.Tetrominoes.Companion.setTetromino
import tetrominoes.Generator.generate
import tetrominoes.Tetromino
class Game {
    enum class GameState {
        NOT_PLAYING,
        GENERATING,
        DROPPING,
        GAME_OVER
    }
    private var state: GameState = GameState.NOT_PLAYING
    private var tetrominoList = mutableListOf<Tetromino>()
    private lateinit var tetromino: Tetromino
    init {
        repeat(3) {
            tetrominoList.add(generate())
        }
    }
    fun update() {
        when (state) {
            GameState.NOT_PLAYING -> state = GameState.GENERATING
            GameState.GENERATING -> generating()
            GameState.DROPPING -> print("")
            GameState.GAME_OVER -> print("")
        }
    }
    private fun generating() {
        tetromino = tetrominoList.first()
        tetrominoList.removeFirst()
        tetrominoList.addLast(generate())
        setTetromino(tetromino)
        state = GameState.DROPPING
    }
    private fun dropping() {
    }
}