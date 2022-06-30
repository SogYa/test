package ru.sogya.projects.weatherapp.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.sogya.projects.domain.usecase.GetForecastForMyLocationUseCase
import ru.sogya.projects.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var getForecastForMyLocationUseCase: GetForecastForMyLocationUseCase
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonGetForecast.setOnClickListener {
            binding.resultTextView.text =
                getForecastForMyLocationUseCase.invoke(55.45, 37.37).toString()
        }
    }
}