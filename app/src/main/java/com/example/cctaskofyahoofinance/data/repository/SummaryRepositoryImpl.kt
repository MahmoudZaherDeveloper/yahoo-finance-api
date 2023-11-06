package com.example.cctaskofyahoofinance.data.repository

import com.example.cctaskofyahoofinance.data.model.summarydetails.SummaryDetailsResponse
import com.example.cctaskofyahoofinance.data.model.summarylist.SummaryResponse
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
    override suspend fun getSummaryList(): Flow<Resource<SummaryResponse>> = flow {
        emit(Resource.Loading())
        try {
            emit(
                Resource.Success(
                    data = dataSource.getSummaryList()
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

    //todo: use safe api call extension to prevent duplication of exception each time
    //todo : we can do 4 packages app, network, data, domain
    override suspend fun getSummaryDetails(
        region: String,
        symbol: String
    ): Flow<Resource<SummaryDetailsResponse>> = flow {
        emit(Resource.Loading())
        try {
            emit(
                Resource.Success(
                    data = dataSource.getSummaryDetails(region, symbol)
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
