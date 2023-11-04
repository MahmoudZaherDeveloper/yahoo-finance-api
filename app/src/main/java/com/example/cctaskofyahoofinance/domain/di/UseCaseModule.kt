package com.example.cctaskofyahoofinance.domain.di

import com.example.cctaskofyahoofinance.domain.repository.SummaryListRepository
import com.example.cctaskofyahoofinance.domain.usecase.GetSummaryList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideSummaryUseCase(summaryListRepository: SummaryListRepository): GetSummaryList {
        return GetSummaryList(summaryListRepository)
    }
}
