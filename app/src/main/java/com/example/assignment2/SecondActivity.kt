package com.example.assignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    private var pethealth = 100
    private var pethunger = 50
    private var petcleanliness = 50
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //Set the buttons and text views
        val btnfeed = findViewById<Button>(R.id.button2)
        val btnclean = findViewById<Button>(R.id.button3)
        val btnplay = findViewById<Button>(R.id.button4)
        val txtHunger = findViewById<EditText>(R.id.textView2)
        val txtClean = findViewById<EditText>(R.id.textView3)
        val txtHappy = findViewById<EditText>(R.id.textView4)
        findViewById<EditText>(R.id.linearLayout)

        //set the intial text values
        txtHunger.setText(pethunger.toString())
        txtClean.setText(petcleanliness.toString())
        txtHappy.setText(pethealth.toString())

        //Handle button Clicks
        btnfeed.setOnClickListener {
            pethunger += 10
            petcleanliness += 10
            pethealth += 5
            txtHunger.setText(pethunger.toString())
            animateImageChange()
        }

        btnclean.setOnClickListener {
            petcleanliness += 10
            pethealth += 10
            txtClean.setText(petcleanliness.toString())
            animateImageChange()
        }

        btnplay.setOnClickListener {
            pethealth += 10
            pethunger += 5
            petcleanliness += 5
            txtHappy.setText(pethealth.toString())
            animateImageChange()
        }


    }

    private fun animateImageChange() {

    }
}