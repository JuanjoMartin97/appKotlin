package com.example.drogxenstock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIngreso = findViewById<Button>(R.id.btnAceptar)
        btnIngreso.setOnClickListener {
            ingresarLista()
        }
    }

    private fun ingresarLista(){
        val intent = Intent(this, ActivityListaStock::class.java)
        startActivity(intent)
    }

}