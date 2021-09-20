package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Response_ : Serializable {
    @SerializedName("approvalStatus")
    @Expose
    var approvalStatus: String? = null

    @SerializedName("createdDate")
    @Expose
    var createdDate: String? = null

    @SerializedName("empRep")
    @Expose
    var empRep: Boolean? = null

    @SerializedName("helpfulCount")
    @Expose
    var helpfulCount: Int? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("notHelpfulCount")
    @Expose
    var notHelpfulCount: Int? = null

    @SerializedName("responseText")
    @Expose
    var responseText: String? = null

    @SerializedName("userHandle")
    @Expose
    var userHandle: String? = null


    constructor() {}


    constructor(approvalStatus: String?, createdDate: String?, empRep: Boolean?, helpfulCount: Int?, id: Int?, notHelpfulCount: Int?, responseText: String?, userHandle: String?) : super() {
        this.approvalStatus = approvalStatus
        this.createdDate = createdDate
        this.empRep = empRep
        this.helpfulCount = helpfulCount
        this.id = id
        this.notHelpfulCount = notHelpfulCount
        this.responseText = responseText
        this.userHandle = userHandle
    }

}
