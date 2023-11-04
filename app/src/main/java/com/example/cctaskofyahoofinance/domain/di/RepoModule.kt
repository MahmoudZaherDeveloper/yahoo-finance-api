package com.example.cctaskofyahoofinance.domain.di

import com.example.cctaskofyahoofinance.data.repository.SummaryListRepositoryImpl
import com.example.cctaskofyahoofinance.data.source.DataSource
import com.example.cctaskofyahoofinance.domain.repository.SummaryListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepoModule {
    @Provides
    @Singleton
    fun provideSummaryRepositoryImpl(dataSource: DataSource): SummaryListRepository =
        SummaryListRepositoryImpl(dataSource)

}
