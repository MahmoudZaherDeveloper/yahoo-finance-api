package com.example.cctaskofyahoofinance.data.source

import com.example.cctaskofyahoofinance.data.model.summarydetails.SummaryDetailsResponse
import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
import com.example.cctaskofyahoofinance.data.source.remote.ApiService
import javax.inject.Inject

class DataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : DataSource {
    override suspend fun getSummaryList(): SummaryResponse =
        apiService.getSummaryList()

    override suspend fun getSummaryDetails(region: String, symbol: String): SummaryDetailsResponse =
        apiService.getSummaryDetails(region, symbol)
}
