package ru.sogya.projects.domain.models

import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("weather")
    val weatherList: List<ForecastWeather>,
    @SerializedName("main")
    val temperatureList: List<ForecastTemperature>,
    val visibility: Long,
    @SerializedName("wind")
    val windList: List<ForecastWind>,
    @SerializedName("dt")
    val time: Long,
    @SerializedName("sys")
    val sysList: List<ForecastSys>,
    @SerializedName("name")
    val cityName: String
)