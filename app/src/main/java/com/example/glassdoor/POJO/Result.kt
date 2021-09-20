package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Result : Serializable {
    @SerializedName("relevancy")
    @Expose
    var relevancy: Relevancy? = null

    @SerializedName("review")
    @Expose
    var review: Review? = null

    @SerializedName("source")
    @Expose
    var source: String? = null

    @SerializedName("suggestedPost")
    @Expose
    var suggestedPost: Boolean? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("interview")
    @Expose
    var interview: Interview? = null

    @SerializedName("salary")
    @Expose
    var salary: Salary? = null


    constructor() {}


    constructor(relevancy: Relevancy?, review: Review?, source: String?, suggestedPost: Boolean?, type: String?, interview: Interview?, salary: Salary?) : super() {
        this.relevancy = relevancy
        this.review = review
        this.source = source
        this.suggestedPost = suggestedPost
        this.type = type
        this.interview = interview
        this.salary = salary
    }


}