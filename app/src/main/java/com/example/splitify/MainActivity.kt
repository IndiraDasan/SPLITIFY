package com.example.splitify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<CardView>(R.id.plusButton)
        val menu = findViewById<ImageView>(R.id.menuIcon)
        val expenseButton = findViewById<CardView>(R.id.expenseButton)

        button.setOnClickListener {

            val intent = Intent(this@MainActivity,HistoryScreen::class.java)
            startActivity(intent)
        }


        expenseButton.setOnClickListener {

            val intent = Intent(this@MainActivity,HistoryScreen::class.java)
            startActivity(intent)
        }


        menu.setOnClickListener {

            val intent = Intent(this@MainActivity,HistoryScreen::class.java)
            startActivity(intent)
        }
    }
}