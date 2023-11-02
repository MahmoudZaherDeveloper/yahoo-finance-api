package com.example.cctaskofyahoofinance.data.repository

import com.example.cctaskofyahoofinance.data.source.DataSource
import javax.inject.Inject

class SummaryRepositoryImpl @Inject constructor(
    private val dataSource: DataSource
)
