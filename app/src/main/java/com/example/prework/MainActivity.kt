package com.example.prework

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.greatnessButton)
        button.setOnClickListener {
            Log.v("Greatness", "Get your popcorn ready!")
            Toast.makeText(this, "Hope your popcorn is ready.",Toast.LENGTH_SHORT).show()


        }
    }
}