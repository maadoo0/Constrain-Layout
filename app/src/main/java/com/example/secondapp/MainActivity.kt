package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt = findViewById<EditText>(R.id.txt)
        val btn = findViewById<Button>(R.id.btn)
        val img = findViewById<ImageView>(R.id.img)
        btn.setOnClickListener{
            Toast.makeText(this , "Welcome Mr : ${txt.text}" ,Toast.LENGTH_LONG ).show()
        }
        img.setOnClickListener{
            Toast.makeText(this , "Hello ${txt.text}" , Toast.LENGTH_LONG).show()
        }
    }
}