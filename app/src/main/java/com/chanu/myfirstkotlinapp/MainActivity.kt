package com.chanu.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onSubmit(view: View) {
        //val inputYear = findViewById<EditText>(R.id.yearEditText)
        //val txtAge = findViewById<TextView>(R.id.ageTextView)

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        ageTextView.text="Age :" + (currentYear - yearEditText.text.toString().toInt())
    }
}