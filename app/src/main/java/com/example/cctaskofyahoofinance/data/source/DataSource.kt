package com.example.cctaskofyahoofinance.data.source

import com.example.cctaskofyahoofinance.data.model.PostsItem
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import kotlinx.coroutines.flow.Flow

interface DataSource {
    suspend fun getRemoteDataList(): Flow<Resource<List<PostsItem>>>
}
