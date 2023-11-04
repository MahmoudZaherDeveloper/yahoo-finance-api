package com.example.cctaskofyahoofinance.data.model.summarylist


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("customPriceAlertConfidence")
    val customPriceAlertConfidence: String,
    @SerializedName("exchange")
    val exchange: String,
    @SerializedName("exchangeTimezoneName")
    val exchangeTimezoneName: String,
    @SerializedName("exchangeTimezoneShortName")
    val exchangeTimezoneShortName: String,
    @SerializedName("fullExchangeName")
    val fullExchangeName: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("market")
    val market: String,
    @SerializedName("marketState")
    val marketState: String,
    @SerializedName("quoteType")
    val quoteType: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("symbol")
    val symbol: String,
)
