package com.example.cctaskofyahoofinance.domain.usecase

import com.example.cctaskofyahoofinance.data.model.summarydetails.SummaryDetailsResponse
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import com.example.cctaskofyahoofinance.domain.repository.SummaryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSummaryDetails @Inject constructor(
    private val summaryRepository: SummaryRepository
) {
    suspend operator fun invoke(
        region: String,
        symbol: String
    ): Flow<Resource<SummaryDetailsResponse>> {
        return summaryRepository.getSummaryDetails(region, symbol)
    }
}
