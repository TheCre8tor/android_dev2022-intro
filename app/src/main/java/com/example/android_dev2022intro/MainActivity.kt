package com.example.android_dev2022intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.etName)
        val submitButton = findViewById<Button>(R.id.tvButton)

        submitButton.setOnClickListener {
            val enteredName = inputField.text.toString()
            val message = "Welcome back $enteredName"

            if (enteredName.isNotEmpty()) {
                greetingTextView.text = message
                inputField.text.clear()
            } else {
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT).show()
                //  Toast.makeText(applicationContext, "Please enter your name", 2000)

                /* What is the difference between applicationContext and this@MainActivity context?
                *  1. applicationContext: is tide to the lifecycle of the entire application.
                *  2. activityContext (this@MainActivity): is tide to the lifecycle of the activity.
                * */
            }
        }
    }
}