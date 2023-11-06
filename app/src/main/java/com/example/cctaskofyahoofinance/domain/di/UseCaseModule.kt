package com.example.cctaskofyahoofinance.domain.di

import com.example.cctaskofyahoofinance.domain.repository.SummaryRepository
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
    fun provideSummaryUseCase(summaryRepository: SummaryRepository): GetSummaryList {
        return GetSummaryList(summaryRepository)
    }
}
