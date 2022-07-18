package ru.sogya.projects.data.entity

import com.google.gson.annotations.SerializedName
import ru.sogya.projects.domain.models.*


data class ForecastEntity(
    @SerializedName("weather")
    val weather: ForecastWeatherEntity,
    @SerializedName("main")
    val temperature: ForecastTemperatureEntity,
    val visibility: Long,
    @SerializedName("wind")
    val wind: ForecastWindEntity,
    @SerializedName("dt")
    val time: Long,
    @SerializedName("sys")
    val sys: ForecastSysEntity,
    @SerializedName("name")
    val cityName: String
) {
    companion object {
        fun fromForecastDomain(forecast: Forecast): ForecastEntity =
            ForecastEntity(
                fromWeatherDomain(forecast.weather),
                fromTemeratureDomain(forecast.temperature),
                forecast.visibility,
                fromWindDomain(forecast.wind),
                forecast.time,
                fromSysDomain(forecast.sys),
                forecast.cityName
            )

        fun fromWeatherDomain(forecastWeather: ForecastWeather): ForecastWeatherEntity =
            ForecastWeatherEntity(
                forecastWeather.weatherType, forecastWeather.description
            )

        fun fromTemeratureDomain(forecastTemperature: ForecastTemperature): ForecastTemperatureEntity =
            ForecastTemperatureEntity(
                forecastTemperature.temperature,
                forecastTemperature.feelsLikeTemperature,
                forecastTemperature.minimalTemperature,
                forecastTemperature.maximalTemperature,
                forecastTemperature.pressure,
                forecastTemperature.humidity
            )

        fun fromWindDomain(forecastWind: ForecastWind): ForecastWindEntity =
            ForecastWindEntity(
                forecastWind.speed, forecastWind.direction
            )

        fun fromSysDomain(forecastSys: ForecastSys): ForecastSysEntity =
            ForecastSysEntity(
                forecastSys.countryCode, forecastSys.sunriseTime, forecastSys.sunsetTime
            )
    }
}
