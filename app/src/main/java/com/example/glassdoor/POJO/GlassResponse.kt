package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class GlassResponse : Serializable {
    @SerializedName("results")
    @Expose
    var results: List<Result>? = null


    constructor() {}

    constructor(results: List<Result>?) : super() {
        this.results = results
    }


}