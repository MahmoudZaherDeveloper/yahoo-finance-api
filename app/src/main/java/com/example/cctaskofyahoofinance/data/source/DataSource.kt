package com.example.cctaskofyahoofinance.data.source

import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse

interface DataSource {
    suspend fun getDataList(): SummaryResponse
}
