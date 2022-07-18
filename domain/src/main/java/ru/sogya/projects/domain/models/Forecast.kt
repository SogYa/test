package ru.sogya.projects.domain.models


data class Forecast(
    val weather: ForecastWeather,
    val temperature: ForecastTemperature,
    val visibility: Long,
    val wind: ForecastWind,
    val time: Long,
    val sys: ForecastSys,
    val cityName: String
)