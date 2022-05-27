package com.example.drogxenstock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drogxenstock.R
import com.example.drogxenstock.adapter.RecyclerAdapter
import com.example.drogxenstock.model.Producto

class ActivityListaStock : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_stock)
        val btnAtras = findViewById<Button>(R.id.btnVolver)
        btnAtras.setOnClickListener {
            finish()
        }
    }


}