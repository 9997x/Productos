package com.juanandres.productos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.juanandres.productos.databinding.ActivityMainBinding
import com.juanandres.productos.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val productoViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        productoViewModel.productoModel.observe(this, Observer{
            binding.descripcionProducto.text = it.descripcionProducto
            binding.nombreProducto.text = it.nombreProducto
            binding.precioProducto.text = it.precioProducto
        })

        binding.viewContainer.setOnClickListener { productoViewModel.randomQuote()}





    }
}   