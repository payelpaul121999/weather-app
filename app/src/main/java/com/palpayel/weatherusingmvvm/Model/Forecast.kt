package com.palpayel.weatherusingmvvm.Model


import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("day")
    val day: String,
    @SerializedName("temperature")
    val temperature: String,
    @SerializedName("wind")
    val wind: String
)