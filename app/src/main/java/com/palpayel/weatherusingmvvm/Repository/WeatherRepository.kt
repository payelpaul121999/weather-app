package com.palpayel.weatherusingmvvm.Repository

import com.palpayel.weatherusingmvvm.API.ApiService
import javax.inject.Inject


class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getWeather() = apiService.getWeather()
}