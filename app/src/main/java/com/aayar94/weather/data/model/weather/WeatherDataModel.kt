package com.aayar94.weather

import com.google.gson.annotations.SerializedName


data class WeatherDataModel (

  @SerializedName("lat"             ) var lat            : Double?           = null,
  @SerializedName("lon"             ) var lon            : Double?           = null,
  @SerializedName("timezone"        ) var timezone       : String?           = null,
  @SerializedName("timezone_offset" ) var timezoneOffset : Int?              = null,
  @SerializedName("current"         ) var current        : Current?          = Current(),
  @SerializedName("hourly"          ) var hourly         : ArrayList<Hourly> = arrayListOf(),
  @SerializedName("daily"           ) var daily          : ArrayList<Daily>  = arrayListOf()

)