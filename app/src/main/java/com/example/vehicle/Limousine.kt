package com.example.vehicle

import android.graphics.drawable.AnimatedVectorDrawable
import android.widget.ImageView

class Limousine(speed: Int, tankVolume: Int, doorCount: Int) : Car(speed, tankVolume, doorCount) {
    var partyMode = false
    override var carImage: Int = R.drawable.limousine_animation

    /** LIMO ACTION: Party Mode **/
    override fun action(iv: ImageView) {
        partyMode = true
        animation(iv)
    }

    fun animation(iv: ImageView) {
        iv.setImageResource(carImage)
        var partyAnimation: AnimatedVectorDrawable = iv.drawable as AnimatedVectorDrawable
        partyAnimation.start()
        partyMode = false
    }
}