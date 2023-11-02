package com.example.cctaskofyahoofinance.domain.repository

import com.example.cctaskofyahoofinance.data.model.PostsItem
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import kotlinx.coroutines.flow.Flow

interface SummaryRepository {
    suspend fun getDataList(): Flow<Resource<List<PostsItem>>>
}
