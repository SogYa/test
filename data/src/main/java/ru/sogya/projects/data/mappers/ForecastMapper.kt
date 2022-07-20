package ru.sogya.projects.data.mappers

import ru.sogya.projects.data.entity.*
import ru.sogya.projects.domain.models.*

class ForecastMapper(
    private val forecastData: ForecastEntity
) {

    //Mapping ForecastEntity(Data) object to ForecastEntity(Domain)
    fun toForecastDomain(): Forecast =
        Forecast(
            fromWeatherListData(forecastData.weatherList),
            fromTemeratureData(forecastData.temperature),
            forecastData.visibility,
            fromWindData(forecastData.windList),
            forecastData.time,
            fromSysData(forecastData.sysList),
            forecastData.cityName
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