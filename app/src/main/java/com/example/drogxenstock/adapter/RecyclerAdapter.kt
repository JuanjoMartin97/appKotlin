package com.example.drogxenstock.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.drogxenstock.R
import com.example.drogxenstock.base.BaseViewHolder
import com.example.drogxenstock.model.Producto

class RecyclerAdapter(private val context: Context, val listaProductos: List<Producto>) :
    RecyclerView.Adapter<BaseViewHolder<*>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return ProductosViewHolder(
            LayoutInflater.from(context).inflate(R.layout.producto_row, parent, false)
        )
    }
    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        //bindea todos los elementos de la lista - pone la info en el viewHolder -celda-

        //tomo el elemento para ponerlo en el recycler view
        when (holder) {
            is ProductosViewHolder -> holder.bind(listaProductos[position], position)
            else -> IllegalArgumentException("Se olvido pasar el viewholder en el bind")
        }

    }
    override fun getItemCount(): Int {
        return listaProductos.size
    }
    inner class ProductosViewHolder(itemView: View) : BaseViewHolder<Producto>(itemView) {
        val descripcion = itemView.findViewById<TextView>(R.id.txt_descripcion_producto)
        val lote = itemView.findViewById<TextView>(R.id.txt_lote)
        val vencimiento = itemView.findViewById<TextView>(R.id.txt_vto)
        val cantidad = itemView.findViewById<TextView>(R.id.txt_cantidad)
        override fun bind(item: Producto, position: Int) {

            descripcion.text = item.descripcion
            lote.text = item.lote
            vencimiento.text = item.vto
            cantidad.text = item.cantidad.toString()


        }
    }
}