package ru.sogya.projects.data.repository

import io.reactivex.Single
import ru.sogya.projects.data.api.NetworkService
import ru.sogya.projects.data.mappers.ForecastMapper
import ru.sogya.projects.domain.models.Forecast
import ru.sogya.projects.domain.repositories.ForecastRepository

class ForecastRepositoryImpl : ForecastRepository {
    override fun getForecastForMyLocation(lat: Double, lon: Double): Single<Forecast> {
        return NetworkService.retrofitService().getForecast(lat, lon)
            .map { return@map ForecastMapper(it).toForecastDomain() }
    }
}