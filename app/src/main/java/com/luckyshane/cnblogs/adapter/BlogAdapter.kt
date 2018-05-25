package com.luckyshane.cnblogs.adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luckyshane.cnblogs.GlideApp
import com.luckyshane.cnblogs.R
import com.luckyshane.cnblogs.model.entity.Blog
import com.luckyshane.cnblogs.ui.activity.BlogDetailActivity
import kotlinx.android.synthetic.main.list_item_blog.view.*

class BlogAdapter(private val blogList: List<Blog>) : RecyclerView.Adapter<BlogAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item_blog, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val blog = blogList[position]
        val context = holder.itemView.context
        holder.itemView.run {
            authorTv.text = blog.authorName
            updateTimeTv.text = ""
            blogTitleTv.text = blog.title
            blogSubtitleTv.text = blog.subtitle
            if (blog.avatarUrl.isNotEmpty()) {
                GlideApp.with(context).load(blog.avatarUrl).into(avatarIv)
            }
            setOnClickListener {
                val intent = Intent(context, BlogDetailActivity::class.java)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return blogList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}
