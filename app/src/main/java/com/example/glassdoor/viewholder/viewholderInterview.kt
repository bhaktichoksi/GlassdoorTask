package com.example.glassdoor.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.POJO.Interview
import com.example.glassdoor.R

class viewholderInterview(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindItems(foInterview: Interview) {

        val txtJob = itemView.findViewById(R.id.tvJobpost) as TextView
        val txtLocation = itemView.findViewById(R.id.tvLocation) as TextView

        val txtDescription = itemView.findViewById(R.id.tvDescriptions) as TextView
        val txtOutcome = itemView.findViewById(R.id.tvOutcome) as TextView
        val txtDifficulty = itemView.findViewById(R.id.tvDifficulty) as TextView
        val txtExperience = itemView.findViewById(R.id.tvExperience) as TextView

        val txtQuestion = itemView.findViewById(R.id.tvQuestion) as TextView
        val txtAnswer = itemView.findViewById(R.id.tvAnswer) as TextView

        txtJob.setText(foInterview.jobTitle.toString() + " at " + foInterview.employerName)
        txtLocation.setText(foInterview.location)
        txtOutcome.setText("Offer " + foInterview.outcome )
        txtDifficulty.setText(foInterview.processDifficulty + " Difficulty")
        txtExperience.setText(foInterview.processOverallExperience + " Experience")

        txtDescription.setText(foInterview.processAnswer)
        foInterview.questions

        var myQuestions = foInterview.questions
        if (myQuestions != null) {
            for (i in 0 until myQuestions.size) {
                var questionList = myQuestions.get(i)

                if (questionList != null) {
                    txtQuestion.setText(questionList.question)
                }

                var myAnswer = questionList.responses
                if (myAnswer != null) {
                    for (j in 0 until myAnswer.size) {
                        var answerList = myAnswer.get(j)

                        if (answerList != null) {
                            txtAnswer.setText(answerList.responseText)
                        }
                    }
                }

            }
        }


    }
}