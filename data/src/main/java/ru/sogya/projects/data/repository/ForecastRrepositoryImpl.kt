package ru.sogya.projects.data.repository

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import ru.sogya.projects.data.api.NetworkService
import ru.sogya.projects.domain.models.Forecast
import ru.sogya.projects.domain.repositories.ForecastRepository

class ForecastRrepositoryImpl : ForecastRepository {

    private val forecastApi = NetworkService.retrofitService()
    private lateinit var forecast: Forecast
    override fun getForecastForMyLocation(lat: Double, lon: Double): Forecast {
        forecastApi.getForecast(lat, lon)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableSingleObserver<Forecast>() {
                override fun onSuccess(t: Forecast) {
                    forecast = t
                }

                override fun onError(e: Throwable) {
                    Log.e("ERROR", e.message.toString())
                }
            })
        return forecast
    }

}