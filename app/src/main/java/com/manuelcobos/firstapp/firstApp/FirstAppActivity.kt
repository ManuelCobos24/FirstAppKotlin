package com.manuelcobos.firstapp.firstApp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.manuelcobos.firstapp.R

class FirstAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnClickMe = findViewById<AppCompatButton>(R.id.btn_click_me)
        val etName = findViewById<AppCompatEditText>(R.id.et_name)

        btnClickMe.setOnClickListener {
            val name = etName.text.toString().trim()

            if (name.isNotEmpty()) {
                startActivity(
                    Intent(this, ResultActivity::class.java)
                        .putExtra("extra_name", name)
                )
            } else {
                Toast.makeText(this, "Error, name is Empty.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}