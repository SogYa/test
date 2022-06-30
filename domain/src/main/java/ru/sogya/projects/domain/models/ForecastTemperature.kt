package ru.sogya.projects.domain.models

data class ForecastTemperature(
    val temperature: Double,
    val feelsLikeTemperature: Double,
    val minimalTemperature: Double,
    val maximalTemperature: Double,
    val pressure: Int,
    val humidity: Int
)
