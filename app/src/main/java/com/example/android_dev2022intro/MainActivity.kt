package com.example.android_dev2022intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Research", "MainActivity : OnCreate")

        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.etName)
        val submitButton = findViewById<Button>(R.id.tvButton)
        val offersButton = findViewById<Button>(R.id.btnOffers)
        var enteredName: String = ""

        submitButton.setOnClickListener {
            enteredName = inputField.text.toString()
            val message = "Welcome back $enteredName"

            if (enteredName.isNotEmpty()) {
                greetingTextView.text = message
                inputField.text.clear()
                offersButton.visibility = View.VISIBLE
            } else {
                offersButton.visibility = View.INVISIBLE
                greetingTextView.text = ""
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT).show()
                //  Toast.makeText(applicationContext, "Please enter your name", 2000)

                /* What is the difference between applicationContext and this@MainActivity context?
                *  1. applicationContext: is tide to the lifecycle of the entire application.
                *  2. activityContext (this@MainActivity): is tide to the lifecycle of the activity.
                * */
            }
        }

        offersButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i("Research", "MainActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("Research", "MainActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("Research", "MainActivity : OnPause")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i("Research", "MainActivity : OnRestart")
    }

    override fun onStop() {
        super.onStop()

        Log.i("Research", "MainActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("Research", "MainActivity : OnDestroy")
    }
}