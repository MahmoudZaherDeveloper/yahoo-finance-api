package com.example.cctaskofyahoofinance.data.repository

import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
import com.example.cctaskofyahoofinance.data.source.DataSource
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import com.example.cctaskofyahoofinance.domain.repository.SummaryListRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class SummaryListRepositoryImpl @Inject constructor(
    private val dataSource: DataSource
) : SummaryListRepository {
    override suspend fun getDataList(): Flow<Resource<SummaryResponse>> = flow {
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
