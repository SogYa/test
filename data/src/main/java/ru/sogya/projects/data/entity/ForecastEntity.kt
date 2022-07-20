package ru.sogya.projects.data.entity

import com.google.gson.annotations.SerializedName
import ru.sogya.projects.domain.models.*

data class ForecastEntity(
    @SerializedName("weather")
    val weatherList: List<ForecastWeatherEntity>,
    @SerializedName("main")
    val temperature: ForecastTemperatureEntity,
    val visibility: Long,
    @SerializedName("wind")
    val windList: ForecastWindEntity,
    @SerializedName("dt")
    val time: Long,
    @SerializedName("sys")
    val sysList: ForecastSysEntity,
    @SerializedName("name")
    val cityName: String
) 
