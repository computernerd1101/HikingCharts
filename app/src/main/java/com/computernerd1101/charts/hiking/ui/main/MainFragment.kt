package com.computernerd1101.charts.hiking.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.computernerd1101.charts.hiking.R
import com.computernerd1101.charts.hiking.databinding.*
import com.github.mikephil.charting.charts.LineChart

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private lateinit var chart: LineChart

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding: MainFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.main_fragment, container, false
        )
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.mainViewModel = viewModel
        chart = binding.chart
        chart.data = viewModel.lineData
        chart.invalidate()
        return binding.root
    }



}