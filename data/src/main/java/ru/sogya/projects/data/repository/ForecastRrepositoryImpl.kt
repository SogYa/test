package ru.sogya.projects.data.repository

import retrofit2.http.GET
import ru.sogya.projects.domain.models.Forecast
import ru.sogya.projects.domain.repositories.ForecastRepository

class ForecastRrepositoryImpl : ForecastRepository {
    override suspend fun getForecastForMyLocation(): Forecast {
        @GET("./data/2.5/weather")
    }
}