package com.example.screentraker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailedViewScreen : AppCompatActivity() {

    lateinit var cbuttontoMain: Button
    lateinit var cbuttontoAvg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)

        cbuttontoMain= findViewById(R.id.buttontomain)
        cbuttontoAvg= findViewById(R.id.buttonAvg)

        cbuttontoMain.setOnClickListener {

            val intent3 = Intent(this, MainActivity::class.java)

            startActivity(intent3)
        }
    }
}