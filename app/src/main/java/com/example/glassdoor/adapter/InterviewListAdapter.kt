package com.example.glassdoor.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.POJO.Interview
import com.example.glassdoor.R
import com.example.glassdoor.viewholder.viewholderInterview

class InterviewListAdapter(var iList: ArrayList<Interview>) : RecyclerView.Adapter<viewholderInterview>(){

    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholderInterview {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.interview_item_list, parent,
                false)

        context = parent.context
        return  viewholderInterview(v)
    }

    override fun getItemCount(): Int {
        return iList.size
    }

    override fun onBindViewHolder(holder: viewholderInterview, position: Int) {
        holder.bindItems(iList[position])
    }


}