package com.example.cctaskofyahoofinance.data.source

import com.example.cctaskofyahoofinance.data.model.PostsItem
import com.example.cctaskofyahoofinance.data.source.remote.ApiService
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : DataSource {
    override suspend fun getRemoteDataList(): Flow<Resource<List<PostsItem>>> =
        apiService.getDataList()

}
