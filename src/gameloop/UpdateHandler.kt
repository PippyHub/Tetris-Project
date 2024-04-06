package gameloop

import swing.Panel

class UpdateHandler(private val panel: Panel) : Runnable {
    private val setFrames: Double = 120.0
    private val setUpdates: Double = 60.0988
    private lateinit var gameThread: Thread
    private var running = false
    init {
        panel.requestFocus()
    }
    fun start() {
        running = true
        gameThread = Thread(this)
        gameThread.start()
    }
    fun stop() {
        running = false
        try {
            gameThread.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
    private fun update(deltaUpdate: Double) {
        panel.update(deltaUpdate)
    }
    private fun repaint() {
        panel.repaint()
    }
    override fun run() {
        val timePerFrame: Double = 1000000000.0 / setFrames
        val timePerUpdate: Double = 1000000000.0 / setUpdates
        var lastUpdate: Long = System.nanoTime()

        var frames = 0.0
        var updates = 0.0
        var lastCheck: Long = System.currentTimeMillis()

        var deltaUpdate = 0.0
        var deltaFrame = 0.0

        while (running) {
            val currentUpdate: Long = System.nanoTime()
            deltaUpdate += (currentUpdate - lastUpdate) / timePerUpdate
            deltaFrame += (currentUpdate - lastUpdate) / timePerFrame
            lastUpdate = currentUpdate

            if (deltaUpdate >= 1) {
                update(deltaUpdate)
                updates++
                deltaUpdate--
            }
            if (deltaFrame >= 1) {
                repaint()
                frames++
                deltaFrame--
            }
            if (System.currentTimeMillis() - lastCheck >= 1000) {
                lastCheck = System.currentTimeMillis()
                println("FPS $frames | UPS $updates")
                frames = 0.0
                updates = 0.0
            }
        }
    }
}