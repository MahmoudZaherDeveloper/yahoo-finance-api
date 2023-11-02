package com.example.cctaskofyahoofinance.data.repository

import com.example.cctaskofyahoofinance.data.model.PostsItem
import com.example.cctaskofyahoofinance.data.source.DataSource
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import com.example.cctaskofyahoofinance.domain.repository.SummaryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class SummaryRepositoryImpl @Inject constructor(
    private val dataSource: DataSource
) : SummaryRepository {
    override suspend fun getDataList(): Flow<Resource<List<PostsItem>>> = flow {
        emit(Resource.Loading())
        try {
            emit(
                Resource.Success(
                    data = dataSource.getDataList()
                )
            )
        } catch (e: HttpException) {
            emit(
                Resource.Error(
                    message = "Oops, something went wrong!"
                )
            )
        } catch (e: IOException) {
            emit(
                Resource.Error(
                    message = "Couldn't reach server, check your internet connection."
                )
            )
        }
    }

}
