package com.example.cctaskofyahoofinance.data.source.remote

import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("market/v2/get-summary?region=US")
    suspend fun getDataList(): SummaryResponse

}
