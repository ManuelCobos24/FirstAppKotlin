package com.manuelcobos.firstapp.firstApp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.manuelcobos.firstapp.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName = findViewById<AppCompatTextView>(R.id.tv_name)
        val name: String = intent.extras?.getString("extra_name").orEmpty()
        tvName.text = "Hello $name"
    }
}