package com.example.cctaskofyahoofinance.data.source.remote

import com.example.cctaskofyahoofinance.data.model.PostsItem
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getDataList(): Flow<Resource<List<PostsItem>>>

}
