package com.example.bandhan.onlinestore.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.bandhan.onlinestore.Adapters.CategoryAdapter
import com.example.bandhan.onlinestore.Model.Category
import com.example.bandhan.onlinestore.R
import com.example.bandhan.onlinestore.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories)



    }
}
