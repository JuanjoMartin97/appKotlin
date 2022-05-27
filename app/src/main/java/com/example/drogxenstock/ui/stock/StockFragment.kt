package com.example.drogxenstock.ui.stock

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drogxenstock.R
import com.example.drogxenstock.adapter.RecyclerAdapter
import com.example.drogxenstock.databinding.FragmentStockBinding
import com.example.drogxenstock.model.Producto

class StockFragment : Fragment() {

    private var _binding: FragmentStockBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    //Inicializamos el modelo del stock en el fragmento
    private val stockViewModel: StockViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStockBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //Recycler view
        val recyclerView = root.findViewById<RecyclerView>(R.id.recyclerViewProductos)
        recyclerView.layoutManager = LinearLayoutManager(root.context)
        recyclerView.addItemDecoration(DividerItemDecoration(root.context, DividerItemDecoration.VERTICAL))


        stockViewModel.getProduct().observe(viewLifecycleOwner, Observer { products ->
            recyclerView.adapter = RecyclerAdapter(root.context, products)
        } )
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}