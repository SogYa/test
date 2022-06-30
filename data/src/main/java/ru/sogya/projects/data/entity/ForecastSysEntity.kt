package ru.sogya.projects.data.entity

import com.google.gson.annotations.SerializedName


data class ForecastSysEntity(
    @SerializedName("country")
    val countryCode: String,
    @SerializedName("sunrise")
    val sunriseTime: Long,
    @SerializedName("sunset")
    val sunsetTime: Long
)