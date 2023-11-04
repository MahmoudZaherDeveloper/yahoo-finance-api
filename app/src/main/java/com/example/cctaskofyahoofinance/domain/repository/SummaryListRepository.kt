package com.example.cctaskofyahoofinance.domain.repository

import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import kotlinx.coroutines.flow.Flow

interface SummaryListRepository {
    suspend fun getDataList(): Flow<Resource<SummaryResponse>>
}
