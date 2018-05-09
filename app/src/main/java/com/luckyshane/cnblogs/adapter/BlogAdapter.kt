package com.luckyshane.cnblogs.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class BlogAdapter2 : RecyclerView.Adapter<BlogAdapter2.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return null
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 0
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}
