package com.palpayel.weatherusingmvvm.API

import com.palpayel.weatherusingmvvm.Model.WeatherData
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Curitiba")
    suspend fun getWeather(): Response<WeatherData>
}
