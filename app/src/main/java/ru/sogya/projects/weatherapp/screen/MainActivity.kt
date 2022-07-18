package ru.sogya.projects.weatherapp.screen

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import ru.sogya.projects.data.repository.ForecastRepositoryImpl
import ru.sogya.projects.domain.models.Forecast
import ru.sogya.projects.domain.usecase.GetForecastForMyLocationUseCase
import ru.sogya.projects.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val repsoitory = ForecastRepositoryImpl()
    private  val getForecastForMyLocationUseCase =  GetForecastForMyLocationUseCase(repsoitory)
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        binding.buttonGetForecast.setOnClickListener {
            getForecastForMyLocationUseCase.invoke(55.45, 37.37).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableSingleObserver<Forecast>() {
                    override fun onSuccess(t: Forecast) {
                        binding.resultTextView.text = t.toString()
                    }

                    override fun onError(e: Throwable) {
                        Log.e("ERROR", e.message.toString())
                    }
                })
        }
    }
}