package ru.sogya.projects.domain.repositories

import ru.sogya.projects.domain.models.Forecast

interface ForecastRepository {

    suspend fun getForecastForMyLocation(): Forecast
}