package com.rakesh.jpmccodetest.ui.screens.home

import com.rakesh.jpmccodetest.data.model.WeatherResponse

// class to handle state of api result
data class HomeState(
    val isLoading: Boolean = false,
    val data: WeatherResponse? = null,
    val error: String = ""

)
