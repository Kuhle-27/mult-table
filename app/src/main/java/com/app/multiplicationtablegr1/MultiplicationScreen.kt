package com.app.multiplicationtablegr1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MultiplicationScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_screen)

        val tvOutput = findViewById<TextView>(R.id.tvOutput)

        //Receive something

        val bundle: Bundle? = intent.extras
        val tableNumber = bundle?.getString("number")
        val number = tableNumber.toString().toInt()

        val limitValue = bundle?.getString("limit")
        val limit = limitValue.toString().toInt()

        val name = bundle?.getString("name")

        tvOutput.text = "Hi $name"

        var data = ""

        var counter = 1

        while (counter <= limit) {
            data += "$number X $counter = ${number * counter} \n"
            counter++
        }

        tvOutput.text = data

    }
}