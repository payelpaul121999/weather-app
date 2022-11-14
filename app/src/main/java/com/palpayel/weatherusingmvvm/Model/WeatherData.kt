package com.palpayel.weatherusingmvvm.Model


import com.google.gson.annotations.SerializedName

data class WeatherData(
    @SerializedName("description")
    val description: String,
    @SerializedName("forecast")
    val forecast: List<Forecast>,
    @SerializedName("temperature")
    val temperature: String,
    @SerializedName("wind")
    val wind: String
)