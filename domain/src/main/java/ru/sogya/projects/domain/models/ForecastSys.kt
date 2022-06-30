package ru.sogya.projects.domain.models

import com.google.gson.annotations.SerializedName


data class ForecastSys(
    @SerializedName("country")
    val countryCode: String,
    @SerializedName("sunrise")
    val sunriseTime: Long,
    @SerializedName("sunset")
    val sunsetTime: Long
)