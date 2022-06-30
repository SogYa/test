package ru.sogya.projects.domain.models

data class ForecastSys(
    val countryCode: String,
    val sunriseTime: Long,
    val sunsetTime: Long
)