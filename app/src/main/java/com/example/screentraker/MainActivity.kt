package com.example.screentraker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //declaring local variables
    lateinit var abuttonStart: Button
    lateinit var abuttonExit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Linking local variables to the widgets
        abuttonStart = findViewById(R.id.button1a)
        abuttonExit = findViewById(R.id.button2a)

        abuttonStart.setOnClickListener {

        val intent1= Intent(this,MainScreen::class.java)

            startActivity(intent1)


        }
    }
}