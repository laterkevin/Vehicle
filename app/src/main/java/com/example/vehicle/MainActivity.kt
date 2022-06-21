package com.example.vehicle

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /** INDEX DES AUSGEWÄHLTEN CARS**/
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** IMAGE VIEW CONTAINER ZUM LADEN DES AUTOBILDES**/
        var imageView: ImageView = findViewById(R.id.vehichle_image_view)

        /**  LISTE DER AUTO OBJEKTE **/
        var cars = listOf<Car>(
            Car(50, 30, 2),
            Cabrio(200, 40, 2),
            Limousine(100, 200, 6),
            Pick_up(80, 450, 2)
        )

        // BEIM START DER APP WIRD DER CONTAINER IMMER AUF DAS CAR GESETZT
        imageView.setImageResource(cars[i].carImage)

        /** ZUGRIFF AUF DIE BUTTONS IM LAYOUT **/
        val driveButton = findViewById<Button>(R.id.drive_button)
        val driveBackwardsButton = findViewById<Button>(R.id.drive_backwards_button)
        val actionButton = findViewById<Button>(R.id.action_button)

        // Zugriff auf den Richtungspfeil
        val arrow = findViewById<ImageView>(R.id.arrow_right)

        /** LISTENER AUF DIE BUTTONS **/
        // TODO: Implementiere die Listener
        driveButton.setOnClickListener { cars[i].drive(imageView) }
        driveBackwardsButton.setOnClickListener { cars[i].drive_reverse(imageView) }
        actionButton.setOnClickListener { cars[i].action(imageView) }
        arrow.setOnClickListener {
            if (i < cars.size) {
                i++
            } else {
                i = 0
            }
            imageView.setImageResource(cars[i].carImage)
        }
    }
}