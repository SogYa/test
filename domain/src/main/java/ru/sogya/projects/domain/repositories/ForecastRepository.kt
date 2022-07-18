package ru.sogya.projects.domain.repositories

import io.reactivex.Single
import ru.sogya.projects.domain.models.Forecast

interface ForecastRepository {

    fun getForecastForMyLocation(lat: Double, lon: Double): Single<Forecast>

}