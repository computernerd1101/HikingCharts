package com.computernerd1101.charts.hiking.ui.main

import android.app.Application
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import com.github.mikephil.charting.data.*
import com.computernerd1101.charts.hiking.R

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val lineData: LineData

    init {
        val entries = arrayListOf(Entry(1f, 1f), Entry(3f, 2f), Entry(4f, 1f))
        val dataSet = LineDataSet(entries, application.getString(R.string.lineDataLabel))
        dataSet.color = ContextCompat.getColor(application, R.color.lineData)
        dataSet.valueTextColor = ContextCompat.getColor(application, R.color.lineDataText)
        lineData = LineData(dataSet)
    }

}