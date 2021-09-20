package com.example.glassdoor.POJO

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class BasePay : Serializable {
    @SerializedName("amount")
    @Expose
    var amount: Float? = null

    @SerializedName("currencyCode")
    @Expose
    var currencyCode: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("symbol")
    @Expose
    var symbol: String? = null

    constructor() {}


    constructor(amount: Float?, currencyCode: String?, name: String?, symbol: String?) : super() {
        this.amount = amount
        this.currencyCode = currencyCode
        this.name = name
        this.symbol = symbol
    }

}