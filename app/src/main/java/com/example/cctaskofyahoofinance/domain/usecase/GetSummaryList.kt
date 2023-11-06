package com.example.cctaskofyahoofinance.domain.usecase

import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import com.example.cctaskofyahoofinance.domain.repository.SummaryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSummaryList @Inject constructor(
    private val summaryRepository: SummaryRepository
) {
    suspend operator fun invoke(): Flow<Resource<SummaryResponse>> {
        return summaryRepository.getSummaryList()
    }
}
