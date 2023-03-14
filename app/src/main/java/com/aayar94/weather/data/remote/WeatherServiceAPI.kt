package com.aayar94.weather.data.remote

import retrofit2.http.GET

interface WeatherServiceAPI {

    @GET("/data/3.0/onecall?exclude=minutely,alerts")
    suspend fun getWeather(
        lat: String,
        lng: String,
        appid: String,
        units: String
    )
}