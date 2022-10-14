package com.example.crabapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // sub menu buttons are created as a variable
    private lateinit var crabMenuButtonOne: Button
    private lateinit var crabMenuButtonTwo: Button
    private lateinit var crabMenuButtonThree: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // button actions are defined
        crabMenuButtonOne = findViewById(R.id.crab_button_one)
        crabMenuButtonTwo = findViewById(R.id.crab_button_two)
        crabMenuButtonThree = findViewById(R.id.crab_button_three)

        // intent event is bound to each button
        crabMenuButtonOne.setOnClickListener {
            val intent = Intent(this, CrabAppTwo::class.java)
            // jump to file
            startActivity(intent)
        }

        crabMenuButtonTwo.setOnClickListener {
            val intent = Intent(this, CrabAppThree::class.java)

            startActivity(intent)
        }

        crabMenuButtonThree.setOnClickListener {
            val intent = Intent(this, CrabAppFour::class.java)

            startActivity(intent)
        }
    }
}