package com.example.blogproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(private var blogs: List<Blog>) : RecyclerView.Adapter<BlogAdapter.BlogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.blog_item, parent, false)
        return BlogViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        holder.bind(blogs[position])
    }

    override fun getItemCount(): Int = blogs.size

    fun updateBlogs(newBlogs: List<Blog>) {
        blogs = newBlogs
        notifyDataSetChanged()
    }

    class BlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.blogTitleTextView)

        fun bind(blog: Blog) {
            titleTextView.text = blog.title
        }
    }
}
