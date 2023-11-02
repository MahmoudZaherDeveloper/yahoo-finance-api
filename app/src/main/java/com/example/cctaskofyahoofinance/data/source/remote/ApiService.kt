package com.example.cctaskofyahoofinance.data.source.remote

import com.example.cctaskofyahoofinance.data.model.PostsItem
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getDataList(): List<PostsItem>

}
