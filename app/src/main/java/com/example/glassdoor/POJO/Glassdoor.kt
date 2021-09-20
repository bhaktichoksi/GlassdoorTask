package com.example.glassdoor.POJO


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable


class Glassdoor : Serializable {
    @SerializedName("jessionid")
    @Expose
    var jessionid: String? = null

    @SerializedName("response")
    @Expose
    var response: GlassResponse? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("success")
    @Expose
    var success: Boolean? = null

    constructor() {}

    constructor(jessionid: String?, response: GlassResponse?, status: String?, success: Boolean?) : super() {
        this.jessionid = jessionid
        this.response = response
        this.status = status
        this.success = success
    }

}