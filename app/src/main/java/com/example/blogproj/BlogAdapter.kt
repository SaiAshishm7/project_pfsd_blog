package com.example.blogproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Blog(
    val title: String,
    val genre: String
)

class BlogAdapter(private val blogList: MutableList<Blog>) : RecyclerView.Adapter<BlogAdapter.BlogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_blog, parent, false)
        return BlogViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog = blogList[position]
        holder.bind(blog)
    }

    override fun getItemCount(): Int {
        return blogList.size
    }

    fun updateBlogs(newBlogs: List<Blog>) {
        blogList.clear()
        blogList.addAll(newBlogs)
        notifyDataSetChanged()
    }

    class BlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        private val genreTextView: TextView = itemView.findViewById(R.id.textViewGenre)

        fun bind(blog: Blog) {
            titleTextView.text = blog.title
            genreTextView.text = blog.genre
        }
    }
}
