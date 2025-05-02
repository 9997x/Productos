package com.juanandres.productos.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juanandres.productos.model.ProductoModel
import com.juanandres.productos.model.ProductoProvider

class QuoteViewModel : ViewModel() {


    val productoModel = MutableLiveData<ProductoModel>()


    fun randomQuote(){
        val currentProducto : ProductoModel = ProductoProvider.random()
        productoModel.postValue(currentProducto)
    }





}