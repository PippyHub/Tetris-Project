package draw

import java.awt.Graphics
class Tetrominoes(g: Graphics?) {
    private companion object {
        const val MINO_SIZE = Grid.WIDTH / 10
    }
    init {
        print(MINO_SIZE)
        //g?.fillRoundRect(Grid.GRID_X, Grid.GRID_Y, MINO_SIZE, MINO_SIZE,10,10)
    }
}