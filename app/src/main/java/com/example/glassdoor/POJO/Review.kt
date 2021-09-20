package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Review : Serializable {
    @SerializedName("advice")
    @Expose
    var advice: String? = null

    @SerializedName("approvalStatus")
    @Expose
    var approvalStatus: String? = null

    @SerializedName("careerOpportunitiesRating")
    @Expose
    var careerOpportunitiesRating: Float? = null

    @SerializedName("cons")
    @Expose
    var cons: String? = null

    @SerializedName("employerName")
    @Expose
    var employerName: String? = null

    @SerializedName("employmentStatus")
    @Expose
    var employmentStatus: String? = null

    @SerializedName("headline")
    @Expose
    var headline: String? = null

    @SerializedName("jobTitle")
    @Expose
    var jobTitle: String? = null

    @SerializedName("pros")
    @Expose
    var pros: String? = null

    constructor() {}


    constructor(advice: String?, approvalStatus: String?, careerOpportunitiesRating: Float?, cons: String?, employerName: String?, employmentStatus: String?, headline: String?, jobTitle: String?, pros: String?) : super() {
        this.advice = advice
        this.approvalStatus = approvalStatus
        this.careerOpportunitiesRating = careerOpportunitiesRating
        this.cons = cons
        this.employerName = employerName
        this.employmentStatus = employmentStatus
        this.headline = headline
        this.jobTitle = jobTitle
        this.pros = pros

    }


}