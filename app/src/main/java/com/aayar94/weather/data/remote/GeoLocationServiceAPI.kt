package com.aayar94.weather.data.remote

import retrofit2.http.GET

interface GeoLocationServiceAPI {

    @GET("/geo/1.0/reverse?limit=1")
    fun getCityName(
        lat: String,
        lng: String,
        appid: String
    )

}