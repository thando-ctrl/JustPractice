package com.example.screentraker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainScreen : AppCompatActivity() {

    //Declaring local variable
    lateinit var bbuttonDetail: Button
    lateinit var bbuttonClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        bbuttonDetail = findViewById(R.id.button1b)
        bbuttonClear = findViewById(R.id.button2b)

        bbuttonDetail.setOnClickListener {

            val intent2 = Intent(this,DetailedViewScreen::class.java)

            startActivity(intent2)
        }
    }
}