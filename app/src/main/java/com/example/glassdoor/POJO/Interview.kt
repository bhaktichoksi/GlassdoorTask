package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Interview : Serializable {
    @SerializedName("approvalStatus")
    @Expose
    var approvalStatus: String? = null

    @SerializedName("employerName")
    @Expose
    var employerName: String? = null

    @SerializedName("interviewDate")
    @Expose
    var interviewDate: Any? = null

    @SerializedName("jobTitle")
    @Expose
    var jobTitle: String? = null

    @SerializedName("location")
    @Expose
    var location: String? = null

    @SerializedName("outcome")
    @Expose
    var outcome: String? = null

    @SerializedName("processAnswer")
    @Expose
    var processAnswer: String? = null

    @SerializedName("processDifficulty")
    @Expose
    var processDifficulty: String? = null

    @SerializedName("processInterviewExperience")
    @Expose
    var processInterviewExperience: Any? = null

    @SerializedName("processOverallExperience")
    @Expose
    var processOverallExperience: String? = null

    @SerializedName("questions")
    @Expose
    var questions: List<Question>? = null

    constructor() {}

    constructor(approvalStatus: String?, employerName: String?, interviewDate: Any?, jobTitle: String?, location: String?, outcome: String?, processAnswer: String?, processDifficulty: String?, processInterviewExperience: Any?, processOverallExperience: String?, questions: List<Question>?) : super() {
        this.approvalStatus = approvalStatus
        this.employerName = employerName
        this.interviewDate = interviewDate
        this.jobTitle = jobTitle
        this.location = location
        this.outcome = outcome
        this.processAnswer = processAnswer
        this.processDifficulty = processDifficulty
        this.processInterviewExperience = processInterviewExperience
        this.processOverallExperience = processOverallExperience
        this.questions = questions

    }

}