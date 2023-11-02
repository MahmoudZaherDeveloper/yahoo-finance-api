package com.example.cctaskofyahoofinance.data.source

import com.example.cctaskofyahoofinance.data.model.PostsItem
import com.example.cctaskofyahoofinance.data.source.remote.ApiService
import javax.inject.Inject

class DataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : DataSource {
    override suspend fun getDataList(): List<PostsItem> =
        apiService.getDataList()

}
