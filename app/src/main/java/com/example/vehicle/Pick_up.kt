package com.example.vehicle

import android.graphics.drawable.AnimatedVectorDrawable
import android.widget.ImageView

/** CABRIO KLASSE: ERBT VON DER CAR KLASSE **/
class Pick_up(speed: Int, tankVolume: Int, doorCount: Int) : Car(speed, tankVolume, doorCount) {

    private var disco = false
    override var carImage = R.drawable.pick_up

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
