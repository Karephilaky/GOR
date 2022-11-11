package com.example.gor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etMessage:EditText=findViewById(R.id.etMessage)
        val btnShow: Button =findViewById(R.id.boton)




        btnShow!!.setOnClickListener{
            val message=etMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}