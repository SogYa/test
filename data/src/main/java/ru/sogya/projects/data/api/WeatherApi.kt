package ru.sogya.projects.data.api

import io.reactivex.Single
import retrofit2.http.POST
import retrofit2.http.Query
import ru.sogya.projects.data.entity.ForecastEntity
import ru.sogya.projects.domain.models.Forecast

interface WeatherApi {
    @POST("weather?appid=3fa835e02db74ada88227026f9ea6a31&units=metric")
    fun getForecast(@Query("lat") lat: Double, @Query("lon") lon: Double): Single<ForecastEntity>
}