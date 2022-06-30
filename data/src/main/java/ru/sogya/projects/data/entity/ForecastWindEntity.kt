package ru.sogya.projects.data.entity

import com.google.gson.annotations.SerializedName

data class ForecastWindEntity(
    val speed: Double,
    @SerializedName("deg")
    val direction: Int
)