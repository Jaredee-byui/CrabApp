package com.example.crabapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.media.MediaPlayer
import com.bumptech.glide.Glide
import androidx.appcompat.app.AppCompatActivity

class CrabAppFour : AppCompatActivity() {
    // return button and media player are created
    private lateinit var returnButton: Button
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crab_app_four)

        // media player is defined and audio begins playings
        mediaPlayer = MediaPlayer.create(this, R.raw.crabravemusic)
        mediaPlayer?.setOnPreparedListener { println("Ready to go") }
        mediaPlayer?.start()

        // the image variable is created
        val imageView: ImageView = findViewById(R.id.imageView)
        // the image is defined
        Glide.with(this).load(R.drawable.crabdance).into(imageView)

        returnButton = findViewById(R.id.return_button_three)

        returnButton.setOnClickListener {
            // return intent is defined and music ends when return is pressed
            val intent = Intent(this, MainActivity::class.java)
            mediaPlayer?.pause()
            mediaPlayer?.seekTo(0)
            startActivity(intent)
        }
    }
}