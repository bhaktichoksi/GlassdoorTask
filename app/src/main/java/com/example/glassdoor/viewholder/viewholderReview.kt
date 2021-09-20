package com.example.glassdoor.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.POJO.Review
import com.example.glassdoor.R

class viewholderReview(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindItems(foReview: Review) {

        val txtEmployer = itemView.findViewById(R.id.tvEmployer) as TextView
        val txtJobtitle = itemView.findViewById(R.id.tvJobtitle) as TextView
        val txtStatus = itemView.findViewById(R.id.tvStatus) as TextView
        val txtHeadline = itemView.findViewById(R.id.tvHeadline) as TextView
        val txtAdvice = itemView.findViewById(R.id.tvAdvice) as TextView
        val txtRating = itemView.findViewById(R.id.tvRating) as TextView
        val txtPros = itemView.findViewById(R.id.tvPros) as TextView
        val txtCons = itemView.findViewById(R.id.tvCons) as TextView

        txtEmployer.setText("Employer : " + foReview.employerName)
        txtJobtitle.setText("Position : " + foReview.jobTitle)
        txtStatus.setText("Type : " + foReview.employmentStatus)
        txtHeadline.setText("'" +foReview.headline+"'")
        if(foReview.advice != null){
            txtAdvice.setText("Advice : \n" + foReview.advice)
        }else{
            txtAdvice.visibility = View.GONE
        }

        txtRating.setText("Ratings : " + foReview.careerOpportunitiesRating.toString()+"/5.0")
        txtPros.setText(foReview.pros)
        txtCons.setText(foReview.cons)



    }
}