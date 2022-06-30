package ru.sogya.projects.domain.models

import com.google.gson.annotations.SerializedName

data class ForecastTemperature(

    @SerializedName("temp")
    val temperature: Double,
    @SerializedName("feels_like")
    val feelsLikeTemperature: Double,
    @SerializedName("temp_min")
    val minimalTemperature: Double,
    @SerializedName("temp_max")
    val maximalTemperature: Double,
    val pressure: Int,
    val humidity: Int
)
