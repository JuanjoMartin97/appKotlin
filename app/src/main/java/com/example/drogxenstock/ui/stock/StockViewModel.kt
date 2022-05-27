package com.example.drogxenstock.ui.stock

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.drogxenstock.model.Producto

class StockViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }

    private var _products = MutableLiveData<List<Producto>>()

    fun setProducts(arrProd: List<Producto>) {
        _products.value = arrProd
    }

    fun getProduct(): LiveData<List<Producto>> {
        return _products
    }

    val text: LiveData<String> = _text
}