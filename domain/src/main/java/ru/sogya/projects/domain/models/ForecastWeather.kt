package ru.sogya.projects.domain.models

import com.google.gson.annotations.SerializedName

data class ForecastWeather(
    @SerializedName("main")
    val weatherType: String,
    val description: String
)
