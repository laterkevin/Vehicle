package com.example.vehicle

import android.widget.ImageView

class Pick_up(
    speed: Int,
    tankVolume: Int,
    doorCount: Int,
    wheelSize: Int = 4,
    hasHardTop: Boolean = false
) : Car(speed, tankVolume, doorCount) {
    val isCool = true
    override var carImage: Int = R.drawable.pick_up

    override fun action(iv: ImageView) {
        jump(iv)
    }

    private fun jump(iv: ImageView) {
        for (i in 1..50) {
            iv.y -= 2
            Thread.sleep(20)
        }
        for (i in 1..50) {
            iv.y += 2
            Thread.sleep(20)
        }
    }
}