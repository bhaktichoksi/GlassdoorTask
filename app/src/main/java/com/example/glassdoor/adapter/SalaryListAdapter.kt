package com.example.glassdoor.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.POJO.Salary
import com.example.glassdoor.R
import com.example.glassdoor.viewholder.viewholderSalary

class SalaryListAdapter(var sList: ArrayList<Salary>) : RecyclerView.Adapter<viewholderSalary>(){

    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholderSalary {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.salary_item_list, parent,
                false)

        context = parent.context
        return  viewholderSalary(v)
    }

    override fun getItemCount(): Int {
        return sList.size
    }

    override fun onBindViewHolder(holder: viewholderSalary, position: Int) {
        holder.bindItems(sList[position])
    }
}