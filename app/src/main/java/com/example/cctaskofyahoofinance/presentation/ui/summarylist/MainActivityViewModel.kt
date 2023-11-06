package com.example.cctaskofyahoofinance.presentation.ui.summarylist

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import com.example.cctaskofyahoofinance.domain.usecase.GetSummaryList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val getSummaryList: GetSummaryList
) : ViewModel() {

    private val _state = mutableStateOf(SummaryUiState())
    val state: State<SummaryUiState> = _state

    init {
        getSummaries()
    }

    private fun getSummaries() {
        viewModelScope.launch {
            while (true) {
                getSummaryList().onEach { result ->
                    when (result) {
                        is Resource.Loading -> {
                            _state.value = state.value.copy(
                                summaryList = result.data?.marketSummaryAndSparkResponse?.result
                                    ?: emptyList(),
                                isLoading = true
                            )
                        }

                        is Resource.Success -> {
                            _state.value = state.value.copy(
                                summaryList = result.data?.marketSummaryAndSparkResponse?.result
                                    ?: emptyList(),
                                isLoading = false
                            )
                        }

                        is Resource.Error -> {
                            _state.value = state.value.copy(
                                summaryList = result.data?.marketSummaryAndSparkResponse?.result
                                    ?: emptyList(),
                                isLoading = false
                            )

                        }
                    }
                }.launchIn(this)
                delay(8000)
            }
        }
    }
}
