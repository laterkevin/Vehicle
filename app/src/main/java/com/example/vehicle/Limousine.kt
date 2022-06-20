package com.example.vehicle

import android.graphics.drawable.AnimatedVectorDrawable
import android.widget.ImageView

/** CABRIO KLASSE: ERBT VON DER CAR KLASSE **/
class Limousine(speed: Int, tankVolume: Int, doorCount: Int) : Car(speed, tankVolume, doorCount) {

    private var disco = false
    override var carImage = R.drawable.limousine_animation

    /** Disco Animation **/
    override fun action(iv: ImageView) {
        // TODO

        /** Disco **/
        fun animation(iv: ImageView) {
            iv.setImageResource(carImage)
            var animatedLimousine: AnimatedVectorDrawable = iv.drawable as AnimatedVectorDrawable
            animatedLimousine.start()
        }
    }
}
