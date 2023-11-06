package com.example.cctaskofyahoofinance.presentation.ui.summarydetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cctaskofyahoofinance.data.source.remote.Resource
import com.example.cctaskofyahoofinance.domain.usecase.GetSummaryDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SummaryDetailsViewModel @Inject constructor(
    private val getSummaryDetails: GetSummaryDetails,
    stateHandle: SavedStateHandle
) : ViewModel() {

    private val region = stateHandle.get<String>("region")
    private val symbol = stateHandle.get<String>("symbol")

    init {
        getSummaryDetail(region = region, symbol = symbol)
    }

    private val _state = MutableStateFlow(SummaryDetailsUiState())
    val state: StateFlow<SummaryDetailsUiState> = _state
    private fun getSummaryDetail(region: String?, symbol: String?) {
        if (region.isNullOrBlank() || symbol.isNullOrBlank())
            return
        viewModelScope.launch {

            getSummaryDetails(region, symbol)
                .onEach { result ->
                    when (result) {
                        is Resource.Loading -> {
                            _state.value = state.value.copy(
                                summaryDetails = result.data,
                                isLoading = true
                            )
                        }

                        is Resource.Success -> {
                            _state.value = state.value.copy(
                                summaryDetails = result.data,
                                isLoading = false
                            )
                        }

                        is Resource.Error -> {
                            _state.value = state.value.copy(
                                summaryDetails = result.data,
                                isLoading = false
                            )

                        }
                    }
                }.launchIn(this)
        }
    }
}
