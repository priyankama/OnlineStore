package com.example.bandhan.onlinestore.Services

import com.example.bandhan.onlinestore.Model.Category
import com.example.bandhan.onlinestore.Model.Product

object DataService {
    val categories = listOf(
            Category("Shirts","shirtimage"),
            Category("Hoodies","hoodieimage"),
            Category("Hats","hatimage"),
            Category("Digital","digitalgoodsimage")
    )
    val hats = listOf(
            Product("Hats..section","Rs.200","hat1"),
            Product("Hats..section","Rs.250","hat2"),
            Product("Hats..section","Rs.150","hat3"),
            Product("Hats..section","Rs.200","hat1"),
            Product("Hats..section","Rs.250","hat2"),
            Product("Hats..section","Rs.150","hat3"),
            Product("Hats..section","Rs.300","hat4")
    )
    val shirts = listOf(
            Product("shirts..section","Rs.500","shirt1"),
            Product("shirts..section","Rs.400","shirt2"),
            Product("shirts..section","Rs.1500","shirt3"),
            Product("shirts..section","Rs.500","shirt1"),
            Product("shirts..section","Rs.400","shirt2"),
            Product("shirts..section","Rs.1500","shirt3"),
            Product("shirts..section","Rs.1000","shirt4")
    )
    val hoodie = listOf(
            Product("hoodie..section","Rs.1000","hoodie1"),
            Product("hoodie..section","Rs.2000","hoodie2"),
            Product("hoodie..section","Rs.1500","hoodie3"),
            Product("hoodie..section","Rs.1000","hoodie1"),
            Product("hoodie..section","Rs.2000","hoodie2"),
            Product("hoodie..section","Rs.1500","hoodie3"),
            Product("hoodie..section","Rs.1700","hoodie4")
    )
    val digitalgood = listOf<Product>()

    fun getProducts(category: String ): List<Product>{
       return when(category){
            "SHIRTS" -> shirts
            "HOODIE" -> hoodie
            "HATS" -> hats
            else -> digitalgood

        }

    }
}