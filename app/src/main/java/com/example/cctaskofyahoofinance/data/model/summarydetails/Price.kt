package com.example.cctaskofyahoofinance.data.model.summarydetails


import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("currency")
    val currency: String,
    @SerializedName("currencySymbol")
    val currencySymbol: String,
    @SerializedName("exchange")
    val exchange: String,
    @SerializedName("exchangeName")
    val exchangeName: String,
    @SerializedName("longName")
    val longName: String,
    @SerializedName("marketState")
    val marketState: String,
    @SerializedName("quoteSourceName")
    val quoteSourceName: String,
    @SerializedName("quoteType")
    val quoteType: String,
    @SerializedName("regularMarketSource")
    val regularMarketSource: String,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("symbol")
    val symbol: String
)
