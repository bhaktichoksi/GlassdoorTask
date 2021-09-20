package com.example.glassdoor.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.POJO.Salary
import com.example.glassdoor.R

class viewholderSalary(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindItems(foSalary: Salary) {

        val txtEmployer = itemView.findViewById(R.id.tvEmployer) as TextView
        val txtJob = itemView.findViewById(R.id.tvJobtitle) as TextView

        val txtStatus = itemView.findViewById(R.id.tvStatus) as TextView
        val txtLocation = itemView.findViewById(R.id.tvLocation) as TextView
        val txtPayperiod = itemView.findViewById(R.id.tvPayperiod) as TextView
        val txtSalary = itemView.findViewById(R.id.tvSalary) as TextView
        val txtBaseSalary = itemView.findViewById(R.id.tvBaseSalary) as TextView


        txtEmployer.setText(foSalary.employerName)
        txtJob.setText(foSalary.jobTitle)
        txtStatus.setText("Employement Status : " + foSalary.employmentStatus)
        txtLocation.setText(foSalary.location)
        txtPayperiod.setText("Pay Period : " +foSalary.payPeriod)

        txtSalary.setText(foSalary.basePay?.amount.toString()+" " +foSalary.basePay?.symbol + " " + foSalary.basePay?.currencyCode)
        txtBaseSalary.setText(foSalary.meanBasePay?.amount.toString()+" " +foSalary.meanBasePay?.symbol+ " " + foSalary.meanBasePay?.currencyCode)

    }
}