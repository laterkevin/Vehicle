package com.example.vehicle

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /** INDEX DES AUSGEWÄHLTEN CARS**/
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** IMAGE VIEW CONTAINER ZUM LADEN DES AUTOBILDES**/
        val imageView: ImageView = findViewById(R.id.vehichle_image_view)

        /**  LISTE DER AUTO OBJEKTE **/
        // TODO: Ergänze nach Cabrio um 2 weitere Objekte
        val cars = listOf<Car>(
            Car(50, 30, 2),
            Cabrio(200, 40, 2),
            Limousine(180, 60, 4),
            Pick_up(140, 80, 2)
        )

        // BEIM START DER APP WIRD DER CONTAINER IMMER AUF DAS CAR GESETZT
        imageView.setImageResource(cars[i].carImage)

        /** ZUGRIFF AUF DIE BUTTONS IM LAYOUT **/
        // TODO
        val drive: Button = findViewById(R.id.drive_button)
        val back: Button = findViewById(R.id.drive_backwards_button)
        val action: Button = findViewById(R.id.action_button)
        val arrow: ImageView = findViewById(R.id.arrow_right)

        /** LISTENER AUF DIE BUTTONS **/
        // TODO
        drive.setOnClickListener {
            cars[i].drive(imageView)
        }

        back.setOnClickListener {
            cars[i].drive_reverse(imageView)
        }

        action.setOnClickListener {
            cars[i].action(imageView)
        }
        arrow.setOnClickListener {
            i++
            if (1 > cars.size -1) {
                i = 0
            }
            imageView.setImageResource(cars[i].carImage)
        }
    }
}
