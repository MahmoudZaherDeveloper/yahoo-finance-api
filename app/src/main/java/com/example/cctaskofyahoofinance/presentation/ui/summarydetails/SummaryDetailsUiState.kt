package com.example.cctaskofyahoofinance.presentation.ui.summarydetails

import com.example.cctaskofyahoofinance.data.model.summarydetails.SummaryDetailsResponse

data class SummaryDetailsUiState(
    val summaryDetails: SummaryDetailsResponse? = null,
    val isLoading: Boolean = false
)
