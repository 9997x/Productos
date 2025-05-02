package com.juanandres.productos.model

class ProductoProvider {
     companion object{

          fun random():ProductoModel{
              val position = (0..2).random()
              return descripcionProductoList[position]
          }


         private val descripcionProductoList = listOf(
             ProductoModel( "Almacenamiento 128GB, Peso 170g, Pantalla Super Retina XDR", "Apple Iphone 16", "1530$"),
             ProductoModel("AI Tops 3352, Tensor de 5gen, RT Cores 4gen, DLSS 4, 32GB GDDR7", "RTX 5090", "2700$"),
             ProductoModel("Cafe frio mezclado de leche con decoracion y chips de chocolate con un mensaje en el vaso", "Cafe StarBucks ", "50$"),
         )

     }


    }