package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Question : Serializable {
    @SerializedName("attributionURL")
    @Expose
    var attributionURL: Any? = null

    @SerializedName("date")
    @Expose
    var date: Any? = null

    @SerializedName("employer")
    @Expose
    var employer: String? = null

    @SerializedName("helpfulCount")
    @Expose
    var helpfulCount: Int? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("jobTitle")
    @Expose
    var jobTitle: String? = null

    @SerializedName("locationCity")
    @Expose
    var locationCity: Any? = null

    @SerializedName("locationCountry")
    @Expose
    var locationCountry: Any? = null

    @SerializedName("locationState")
    @Expose
    var locationState: Any? = null

    @SerializedName("question")
    @Expose
    var question: String? = null

    @SerializedName("responses")
    @Expose
    var responses: List<Response_>? = null

    @SerializedName("squareLogo")
    @Expose
    var squareLogo: String? = null

    @SerializedName("totalHelpfulCount")
    @Expose
    var totalHelpfulCount: Int? = null

    constructor() {}

    constructor(attributionURL: Any?, date: Any?, employer: String?, helpfulCount: Int?, id: Int?, jobTitle: String?, locationCity: Any?, locationCountry: Any?, locationState: Any?, question: String?, responses: List<Response_>?, squareLogo: String?, totalHelpfulCount: Int?) : super() {
        this.attributionURL = attributionURL
        this.date = date
        this.employer = employer
        this.helpfulCount = helpfulCount
        this.id = id
        this.jobTitle = jobTitle
        this.locationCity = locationCity
        this.locationCountry = locationCountry
        this.locationState = locationState
        this.question = question
        this.responses = responses
        this.squareLogo = squareLogo
        this.totalHelpfulCount = totalHelpfulCount
    }


}