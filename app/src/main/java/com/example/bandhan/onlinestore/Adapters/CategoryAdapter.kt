package com.example.bandhan.onlinestore.Adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.bandhan.onlinestore.Model.Category
import com.example.bandhan.onlinestore.R

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter(){

    override fun getItem(positon: Int): Any {
        return categories[positon]
    }

    override fun getItemId(positon: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getView(positon: Int, convertView: View?, parent : ViewGroup?): View {
        val categoryView : View
        val holder:Viewholder
        if (convertView == null)
        {
            categoryView = LayoutInflater.from(context).inflate(R.layout.listlayout,null)
            holder = Viewholder()
            holder.image = categoryView.findViewById(R.id.categoryImage)
            holder.name = categoryView.findViewById(R.id.categoryText)
            categoryView.tag = holder
        }else{
            holder=convertView.tag as Viewholder
            categoryView = convertView
        }
        val category = categories[positon]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.image?.setImageResource(resourceId)

        holder.name?.text=category.title
        return categoryView

    }

    private class Viewholder {
        var image:ImageView? = null
        var name:TextView? = null
    }
}