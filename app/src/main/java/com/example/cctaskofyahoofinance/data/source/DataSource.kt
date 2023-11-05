package com.example.cctaskofyahoofinance.data.source

import com.example.cctaskofyahoofinance.data.model.summarydetails.SummaryDetailsResponse
import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse

interface DataSource {
    suspend fun getSummaryList(): SummaryResponse

    suspend fun getSummaryDetails(region: String, symbol: String): SummaryDetailsResponse
}
