package com.example.cctaskofyahoofinance.data.model.summarydetails


import com.google.gson.annotations.SerializedName

data class SummaryDetailsResponse(
    @SerializedName("price")
    val price: Price,
    @SerializedName("quoteType")
    val quoteType: QuoteType,
    @SerializedName("symbol")
    val symbol: String
)
