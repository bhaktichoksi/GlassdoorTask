package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Salary : Serializable {

    @SerializedName("basePay")
    @Expose
    var basePay: BasePay? = null

    @SerializedName("employerName")
    @Expose
    var employerName: String? = null

    @SerializedName("employmentStatus")
    @Expose
    var employmentStatus: String? = null

    @SerializedName("jobTitle")
    @Expose
    var jobTitle: String? = null

    @SerializedName("location")
    @Expose
    var location: String? = null

    @SerializedName("meanBasePay")
    @Expose
    var meanBasePay: MeanBasePay? = null

    @SerializedName("payPeriod")
    @Expose
    var payPeriod: String? = null

    constructor() {}

    constructor(basePay: BasePay?, employerName: String?, employmentStatus: String?, jobTitle: String?, location: String?, meanBasePay: MeanBasePay?, payPeriod: String?) : super() {
        this.basePay = basePay
        this.employerName = employerName
        this.employmentStatus = employmentStatus
        this.jobTitle = jobTitle
        this.location = location
        this.meanBasePay = meanBasePay
        this.payPeriod = payPeriod

    }


}