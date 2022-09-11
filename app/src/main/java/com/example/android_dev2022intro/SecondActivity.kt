package com.example.android_dev2022intro

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val username = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)

        val message = "$username, you will get free access to all the content for one month"
        textView.text = message
    }
}