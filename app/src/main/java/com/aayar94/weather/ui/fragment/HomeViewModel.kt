package com.aayar94.weather.ui.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aayar94.weather.BuildConfig
import com.aayar94.weather.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    private val API_KEY = BuildConfig.API_KEY
    val units: String = "metric"
    fun getWeatherData(lat: String, lng: String) {
        viewModelScope.launch {
            repository.remote.getWeather(lat, lng, API_KEY, units)
        }
    }

    fun getCityName(lat: String, lng: String) {
        viewModelScope.launch {
            repository.remote.getCityName(lat, lng, API_KEY)
        }
    }

}