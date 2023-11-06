package com.example.cctaskofyahoofinance.presentation.ui.summarydetails

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.cctaskofyahoofinance.databinding.ActivitySummaryDetailsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SummaryDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySummaryDetailsBinding
    private val summaryDetailsViewModel: SummaryDetailsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySummaryDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpData()

    }

    private fun setUpData() {
        lifecycleScope.launch {
            summaryDetailsViewModel.state.collectLatest {
                binding.progressBar.isVisible = it.isLoading
                binding.textView.text = it.summaryDetails?.quoteType?.symbol.orEmpty()
            }

        }
    }
}
