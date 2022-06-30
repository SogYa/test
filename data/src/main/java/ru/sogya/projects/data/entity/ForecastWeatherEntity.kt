package ru.sogya.projects.data.entity

import com.google.gson.annotations.SerializedName

data class ForecastWeatherEntity(
    @SerializedName("main")
    val weatherType: String,
    val description: String
)
