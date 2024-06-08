package com.app.multiplicationtablegr1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber = findViewById<EditText>(R.id.etNumber)
        val etLimit = findViewById<EditText>(R.id.etLimit)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)

        btnMultiply.setOnClickListener {

            if(years >= 10 && years <=20) {
                val intent = Intent(this, MultiplicationScreen::class.java)

                intent.putExtra("name", etName)

                intent.putExtra("number", etNumber.text.toString())
                intent.putExtra("limit", etLimit.text.toString())

                startActivity(intent)
            } else {
                tvResult.text = "error"
            }


        }
    }
}