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
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.practica04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    @SuppressLint("MissingInflatedId")
    var cont = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var eT = findViewById<EditText>(R.id.editText1)
        var tV = findViewById<TextView>(R.id.textView1)
        val cambioMas : Button = findViewById<Button>(R.id.buttonMas)
        val cambioMenos : Button = findViewById<Button>(R.id.buttonMenos)

        eT.setOnFocusChangeListener() {ejemplo,focus->
            if (focus){
            cambioMas.setBackgroundColor((Color.parseColor("#40F506")))
            cambioMenos.setBackgroundColor((Color.parseColor("#F50614")))
            }else{
                cambioMas.setBackgroundColor((Color.parseColor("#9b9b9b")))
                cambioMenos.setBackgroundColor((Color.parseColor("#9b9b9b")))
            }
        }


        cambioMas.setOnClickListener {
            suma()
        }

        cambioMenos.setOnClickListener {
            resta()
        }
        if(tV.getText().toString().equals(0)){
            Toast.makeText(this, "No puede quedar vacio", Toast.LENGTH_LONG).show()        }

    }


     fun suma(){
        var tV = findViewById<TextView>(R.id.textView1)
         var eT = findViewById<EditText>(R.id.editText1)
        cont+=eT.text.toString().toInt()
         tV.text = cont.toString()

    }
     fun resta(){
         var tV = findViewById<TextView>(R.id.textView1)
         var eT = findViewById<EditText>(R.id.editText1)

         if(cont-eT.text.toString().toInt()>=0){
            cont-=eT.text.toString().toInt()
            tV.setText(cont.toString())
        }else{
             Toast.makeText(this, "No se puede calcular negativos", Toast.LENGTH_LONG).show()        }

    }


    }




