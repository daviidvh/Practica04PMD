package com.example.practica04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.CharSequenceTransformation
import android.text.Editable
import android.text.TextWatcher
import com.example.practica04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenerToEditText()
    }

private fun addListenerToEditText(){

    binding.editText1.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?,start: Int,count: Int, after: Int){}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            textView1.setText("dsd"+s)
        }

    })
}

}