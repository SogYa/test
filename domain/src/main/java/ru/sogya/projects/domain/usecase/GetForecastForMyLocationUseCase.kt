package ru.sogya.projects.domain.usecase

import ru.sogya.projects.domain.repositories.ForecastRepository

class GetForecastForMyLocationUseCase(
    private val forecastRepository: ForecastRepository
) {
    fun invoke(lat: Double, lon: Double) = forecastRepository.getForecastForMyLocation(lat, lon)
}