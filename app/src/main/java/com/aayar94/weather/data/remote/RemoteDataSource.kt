package com.aayar94.weather.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val weatherServiceAPI: WeatherServiceAPI,
    private val geoLocationServiceAPI: GeoLocationServiceAPI
) {
    suspend fun getWeather(
        lat: String,
        lng: String,
        appid: String,
        units: String
    ) {
        weatherServiceAPI.getWeather(lat, lng, appid, units)
    }

    suspend fun getCityName(
        lat: String,
        lng: String,
        appid: String
    ) {
        geoLocationServiceAPI.getCityName(lat, lng, appid)
    }

}