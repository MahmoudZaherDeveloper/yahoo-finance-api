package com.example.cctaskofyahoofinance.domain.di

import com.example.cctaskofyahoofinance.data.repository.SummaryRepositoryImpl
import com.example.cctaskofyahoofinance.data.source.DataSource
import com.example.cctaskofyahoofinance.domain.repository.SummaryRepository
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
    fun provideSummaryRepositoryImpl(dataSource: DataSource): SummaryRepository =
        SummaryRepositoryImpl(dataSource)

}
