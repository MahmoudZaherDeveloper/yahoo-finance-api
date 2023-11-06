package com.example.cctaskofyahoofinance.presentation.ui.summarylist

import com.example.cctaskofyahoofinance.data.model.summarylist.Result

data class SummaryUiState(
    val summaryList: List<Result> = emptyList(),
    val isLoading: Boolean = false
)
