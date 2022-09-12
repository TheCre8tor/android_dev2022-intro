package com.example.android_dev2022intro

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("Research", "SecondActivity : OnCreate")

        val username = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)

        val message = "$username, you will get free access to all the content for one month"
        textView.text = message
    }

    override fun onStart() {
        super.onStart()

        Log.i("Research", "SecondActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("Research", "SecondActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("Research", "SecondActivity : OnPause")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i("Research", "SecondActivity : OnRestart")
    }

    override fun onStop() {
        super.onStop()

        Log.i("Research", "SecondActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("Research", "SecondActivity : OnDestroy")
    }
}