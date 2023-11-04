package com.example.cctaskofyahoofinance.presentation.ui.summarylist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cctaskofyahoofinance.data.model.summarylist.Result

@Composable
fun SummaryItem(
    result: Result,
    onItemClick: (Result) -> Unit
) {
    AnimatedBorderCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp),
        gradient = Brush.sweepGradient(listOf(Color.Magenta, Color.Cyan)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .clickable { onItemClick(result) }
                .padding(all = 8.dp)
        ) {
            Text(
                text = "ExchangeName: " + result.fullExchangeName + "  Symbol: " + result.symbol + " ",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Market: " + result.market + " MarketState: " + result.marketState,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
