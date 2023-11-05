package com.example.cctaskofyahoofinance.data.model.summarydetails


import com.google.gson.annotations.SerializedName

data class QuoteType(
    @SerializedName("exchange")
    val exchange: String,
    @SerializedName("exchangeTimezoneName")
    val exchangeTimezoneName: String,
    @SerializedName("exchangeTimezoneShortName")
    val exchangeTimezoneShortName: String,
    @SerializedName("longName")
    val longName: String,
    @SerializedName("market")
    val market: String,
    @SerializedName("messageBoardId")
    val messageBoardId: String,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("symbol")
    val symbol: String
)
