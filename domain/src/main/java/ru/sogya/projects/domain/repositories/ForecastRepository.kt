package ru.sogya.projects.domain.repositories

import ru.sogya.projects.domain.models.Forecast

interface ForecastRepository {

    fun getForecastForMyLocation(lat: Double, lon: Double): Forecast

}