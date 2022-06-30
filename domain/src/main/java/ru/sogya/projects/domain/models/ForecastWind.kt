package ru.sogya.projects.domain.models

import com.google.gson.annotations.SerializedName

data class ForecastWind(
    val speed: Double,
    @SerializedName("deg")
    val direction: Int
)