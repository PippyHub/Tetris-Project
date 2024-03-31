package main

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.Timer
class Event: ActionListener {
    init {
        Timer(100, this).start()
    }
    override fun actionPerformed(e: ActionEvent?) {
    }
}
