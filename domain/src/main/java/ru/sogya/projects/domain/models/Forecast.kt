package ru.sogya.projects.domain.models


data class Forecast(

    val weatherList: List<ForecastWeather>,

    val temperatureList: List<ForecastTemperature>,
    val visibility: Long,

    val windList: List<ForecastWind>,

    val time: Long,

    val sysList: List<ForecastSys>,

    val cityName: String
)