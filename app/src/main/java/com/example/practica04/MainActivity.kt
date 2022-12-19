package com.example.practica04

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.CharSequenceTransformation
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.practica04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonMas).setOnClickListener(){}
        findViewById<Button>(R.id.buttonMenos).setOnClickListener(){}

        val cambioMas : Button = findViewById<Button>(R.id.buttonMas)
        val cambioMenos : Button = findViewById<Button>(R.id.buttonMenos)

        findViewById<EditText>(R.id.editText1).setOnFocusChangeListener { view: View, b: Boolean ->
            if (b.equals(true)){
                cambioMas.setBackgroundColor((Color.parseColor("#40F506").toInt()))
                cambioMenos.setBackgroundColor((Color.parseColor("#F50614").toInt()))

            }else {
                cambioMas.setBackgroundColor((Color.parseColor("#0681F5").toInt()))
                cambioMenos.setBackgroundColor((Color.parseColor("#0681F5").toInt()))
            }

        }

    }
    }




