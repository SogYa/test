package ru.sogya.projects.data.entity

import com.google.gson.annotations.SerializedName


data class ForecastEntity(
    @SerializedName("weather")
    val weatherList: List<ForecastWeatherEntity>,
    @SerializedName("main")
    val temperatureList: List<ForecastTemperatureEntity>,
    val visibility: Long,
    @SerializedName("wind")
    val windList: List<ForecastWindEntity>,
    @SerializedName("dt")
    val time: Long,
    @SerializedName("sys")
    val sysList: List<ForecastSysEntity>,
    @SerializedName("name")
    val cityName: String
)
