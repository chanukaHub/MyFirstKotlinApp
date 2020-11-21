package com.chanu.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onSubmit(view: View) {
        val inputYear = findViewById<EditText>(R.id.yearEditText)
        val txtAge = findViewById<TextView>(R.id.ageTextView)

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        txtAge.text="Age :" + (currentYear - inputYear.text.toString().toInt())
    }
}