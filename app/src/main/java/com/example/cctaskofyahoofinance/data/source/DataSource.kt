package com.example.cctaskofyahoofinance.data.source

import com.example.cctaskofyahoofinance.data.model.PostsItem

interface DataSource {
    suspend fun getDataList(): List<PostsItem>
}
