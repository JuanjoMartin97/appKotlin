package com.example.drogxenstock

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drogxenstock.databinding.FragmentMedicamentoBinding

class MedicamentoFragment : Fragment(R.layout.fragment_medicamento) {

    private  lateinit var binding: FragmentMedicamentoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMedicamentoBinding.bind(view)
    }
}