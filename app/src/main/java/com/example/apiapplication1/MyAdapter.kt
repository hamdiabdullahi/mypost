package com.example.apiapplication1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var context: Context, var PostList: List<post>): RecyclerView.Adapter<ViewHolderPost>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPost {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.post_list_item,parent,false)
        return ViewHolderPost(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolderPost, position: Int) {
        var currentPost=PostList.get(position)
        holder.tvUserid.text=currentPost.userId.toString()
        holder.tvId.text=currentPost.id.toString()
        holder.tvTitle.text=currentPost.title
        holder.tvbody.text=currentPost.body
        var postid-
    }
    override fun getItemCount(): Int {
        return PostList.size
    }
}
    class ViewHolderPost(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvUserid=itemView.findViewById<TextView>(R.id.tvuserId)
        var tvId=itemView.findViewById<TextView>(R.id.tvId)
        var tvTitle=itemView.findViewById<TextView>(R.id.tvtitle)
        var tvbody=itemView.findViewById<TextView>(R.id.tvbody)


    }


}