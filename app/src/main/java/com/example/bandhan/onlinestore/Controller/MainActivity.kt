package com.example.bandhan.onlinestore.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.bandhan.onlinestore.Adapters.CategoryRecyclerAdapter
import com.example.bandhan.onlinestore.R
import com.example.bandhan.onlinestore.Services.DataService
import com.example.bandhan.onlinestore.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecyclerAdapter(this, DataService.categories){category->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY , category.title)
            startActivity(productIntent)

        }
        listitems.adapter=adapter

        val layoutManger = LinearLayoutManager(this)
        listitems.layoutManager=layoutManger
        listitems.setHasFixedSize(true)



    }
}
