package com.example.cctaskofyahoofinance.presentation.ui.summarylist

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SummaryListScreen(
    mainActivityViewModel: MainActivityViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    val state = mainActivityViewModel.state.value
    val listState = rememberLazyListState()
    CircularIndeterminateProgressBar(state)
    LazyColumn(
        Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 16.dp),
        state = listState
    ) {
        items(state.summaryList.size) { i ->
            SummaryItem(result = state.summaryList[i], onItemClick = {
                Toast.makeText(context, it.symbol, Toast.LENGTH_SHORT).show()
            })
        }
    }
}
