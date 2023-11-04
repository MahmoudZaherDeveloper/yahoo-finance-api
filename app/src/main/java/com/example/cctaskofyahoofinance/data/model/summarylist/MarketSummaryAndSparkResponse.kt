package com.example.cctaskofyahoofinance.data.model.summarylist


import com.google.gson.annotations.SerializedName

data class MarketSummaryAndSparkResponse(
    @SerializedName("error")
    val error: Any,
    @SerializedName("result")
    val result: List<Result>
)
