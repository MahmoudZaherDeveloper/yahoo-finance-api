package com.example.cctaskofyahoofinance.domain.repository

import com.example.cctaskofyahoofinance.data.model.summarydetails.SummaryDetailsResponse
import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import kotlinx.coroutines.flow.Flow

interface SummaryRepository {
    suspend fun getSummaryList(): Flow<Resource<SummaryResponse>>

    suspend fun getSummaryDetails(
        region: String,
        symbol: String
    ): Flow<Resource<SummaryDetailsResponse>>
}
