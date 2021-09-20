package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Relevancy : Serializable {
    @SerializedName("city")
    @Expose
    var city: Any? = null

    @SerializedName("employmentStatus")
    @Expose
    var employmentStatus: Any? = null

    @SerializedName("industry")
    @Expose
    var industry: Any? = null

    @SerializedName("jobTitle")
    @Expose
    var jobTitle: Any? = null

    @SerializedName("weight")
    @Expose
    var weight: Float? = null

    constructor() {}

    constructor(city: Any?, employmentStatus: Any?, industry: Any?, jobTitle: Any?, weight: Float?) : super() {
        this.city = city
        this.employmentStatus = employmentStatus
        this.industry = industry
        this.jobTitle = jobTitle
        this.weight = weight
    }

}