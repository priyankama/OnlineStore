package com.example.bandhan.onlinestore.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.bandhan.onlinestore.Model.Product
import com.example.bandhan.onlinestore.R
import kotlinx.android.synthetic.main.product_list.view.*

class ProductsAdapter(val context: Context ,val products: List<Product> ) :RecyclerView.Adapter<ProductsAdapter.ProductHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.product_list, parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position],context)

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.pdtImage)
        val productName = itemView?.findViewById<TextView>(R.id.pdtName)
        val productPrice = itemView?.findViewById<TextView>(R.id.pdtPrice)

        fun bindProduct(product: Product,context: Context){
            val resourceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.Price







        }
    }

}