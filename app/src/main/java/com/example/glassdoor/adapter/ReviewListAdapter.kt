package com.example.glassdoor.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.POJO.Review
import com.example.glassdoor.R
import com.example.glassdoor.viewholder.viewholderReview

class ReviewListAdapter(var rList: ArrayList<Review>) : RecyclerView.Adapter<viewholderReview>(){

    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholderReview {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.review_item_list, parent,
                false)

        context = parent.context
        return  viewholderReview(v)
    }

    override fun getItemCount(): Int {
        return rList.size
    }

    override fun onBindViewHolder(holder: viewholderReview, position: Int) {
        holder.bindItems(rList[position])
    }


}