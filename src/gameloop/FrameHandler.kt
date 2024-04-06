package gameloop

import swing.Panel

class FrameHandler(private val panel: Panel) : Runnable {
    private val setHertz: Double = 120.0
    private val setFrames: Double = 60.0
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
    private fun update(deltaFrame: Double) {
        panel.update(deltaFrame)
    }
    private fun repaint() {
        panel.repaint()
    }
    override fun run() {
        val timePerHertz: Double = 1000000000.0 / setHertz
        val timePerFrame: Double = 1000000000.0 / setFrames
        var lastFrame: Long = System.nanoTime()

        var hertz = 0.0
        var frames = 0.0
        var lastCheck: Long = System.currentTimeMillis()

        var deltaHertz = 0.0
        var deltaFrame = 0.0

        while (running) {
            val currentFrame: Long = System.nanoTime()
            deltaFrame += (currentFrame - lastFrame) / timePerFrame
            deltaHertz += (currentFrame - lastFrame) / timePerHertz
            lastFrame = currentFrame

            if (deltaFrame >= 1) {
                update(deltaFrame)
                frames++
                deltaFrame--
            }
            if (deltaHertz >= 1) {
                repaint()
                hertz++
                deltaHertz--
            }
            if (System.currentTimeMillis() - lastCheck >= 1000) {
                println("HZ $hertz | FPS $frames")
                lastCheck = System.currentTimeMillis()
                hertz = 0.0
                frames = 0.0
            }
        }
    }
}