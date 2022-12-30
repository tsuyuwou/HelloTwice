package com.example.helloworld

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoView = findViewById<View>(R.id.video_view) as VideoView
        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.sana_say_hello))
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked")
            videoView.start()
            Toast.makeText(this, "Annyeong!", Toast.LENGTH_SHORT).apply {
                setGravity(Gravity.CENTER, 0, 280)
            }.show()
        }
    }
}
