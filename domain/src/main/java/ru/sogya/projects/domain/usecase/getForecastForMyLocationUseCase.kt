package ru.sogya.projects.domain.usecase

import ru.sogya.projects.domain.repositories.ForecastRepository

class getForecastForMyLocationUseCase(
    private val forecastRepository: ForecastRepository,
    val lat: Double, val lon: Double
) {
    fun invoke() = forecastRepository.getForecastForMyLocation(lat, lon)
}