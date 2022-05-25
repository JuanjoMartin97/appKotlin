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
        setupRecyclerView()
        val btnAtras = findViewById<Button>(R.id.btnVolver)
        btnAtras.setOnClickListener {
            finish()
        }
    }
    val productList = mutableListOf(
        Producto("Dexametasona 5mg Amp 5ml", "1234", ("05/2022"), 44332),
        Producto("Amoxicilina + Clavu Comp 10mg", "4565", ("05/2021"), 832),
        Producto("Ranitidina 5mg Amp 5ml", "345", ("05/2015"), 718),
        Producto("Ketorolac 5mg Amp 5ml", "34235", ("05/2015"), 5238)
    )

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProductos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        recyclerView.adapter = RecyclerAdapter(this, productList)
    }


}