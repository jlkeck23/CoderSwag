package com.jenk.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.jenk.coderswag.Model.Category
import com.jenk.coderswag.R

class CategoryAdapter(context : Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    //this is being used to create views for our custom list class
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder
        //if a view does not exist yet we create it here
        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        }
        //else we recycle the view so we do not waste resources
        else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]

    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        //returning the number of rows in the array that needs to be displayed
        return categories.count()
    }

    private class ViewHolder{

        var categoryImage: ImageView? = null
        var categoryName: TextView? = null

    }

}