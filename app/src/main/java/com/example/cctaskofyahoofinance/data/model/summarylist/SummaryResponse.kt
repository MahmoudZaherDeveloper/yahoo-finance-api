package com.example.cctaskofyahoofinance.data.model.summarylist


import com.google.gson.annotations.SerializedName

data class SummaryResponse(
    @SerializedName("marketSummaryAndSparkResponse")
    val marketSummaryAndSparkResponse: MarketSummaryAndSparkResponse
)
