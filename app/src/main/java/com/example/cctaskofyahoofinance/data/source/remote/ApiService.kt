package com.example.cctaskofyahoofinance.data.source.remote

import com.example.cctaskofyahoofinance.data.model.summarydetails.SummaryDetailsResponse
import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("market/v2/get-summary?region=US")
    suspend fun getSummaryList(): SummaryResponse

    @GET("stock/v2/get-summary")
    suspend fun getSummaryDetails(
        @Query("region") region: String,
        @Query("symbol") symbol: String,
    ): SummaryDetailsResponse

}
