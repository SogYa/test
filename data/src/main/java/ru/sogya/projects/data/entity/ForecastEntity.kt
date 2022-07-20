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
) {
    companion object {
        //Mapping ForecastEntity(Data) object to ForecastEntity(Domain)
        fun toForecastDomain(forecast: ForecastEntity): Forecast =
            Forecast(
                fromWeatherListData(forecast.weatherList),
                fromTemeratureData(forecast.temperature),
                forecast.visibility,
                fromWindData(forecast.windList),
                forecast.time,
                fromSysData(forecast.sysList),
                forecast.cityName
            )

        //Map weatherList from domain to weatherList from data
        private fun fromWeatherListData(forecastWeather: List<ForecastWeatherEntity>): List<ForecastWeather> {
            val listOfWeatherEntities = mutableListOf<ForecastWeather>()
            for (forecasts in forecastWeather) {
                listOfWeatherEntities.add(fromWeatherEntityData(forecasts))
            }
            return listOfWeatherEntities
        }

        private fun fromWeatherEntityData(forecastWeather: ForecastWeatherEntity): ForecastWeather =
            ForecastWeather(
                forecastWeather.weatherType, forecastWeather.description
            )


        private fun fromTemeratureData(forecastTemperature: ForecastTemperatureEntity): ForecastTemperature =
            ForecastTemperature(
                forecastTemperature.temperature,
                forecastTemperature.feelsLikeTemperature,
                forecastTemperature.minimalTemperature,
                forecastTemperature.maximalTemperature,
                forecastTemperature.pressure,
                forecastTemperature.humidity
            )

        private fun fromWindData(forecastWind: ForecastWindEntity): ForecastWind =
            ForecastWind(
                forecastWind.speed, forecastWind.direction
            )

        private fun fromSysData(forecastSys: ForecastSysEntity): ForecastSys =
            ForecastSys(
                forecastSys.countryCode, forecastSys.sunriseTime, forecastSys.sunsetTime
            )
    }
}
