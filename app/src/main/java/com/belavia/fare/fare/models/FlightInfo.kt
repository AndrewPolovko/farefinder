package com.belavia.fare.fare.models

data class FlightInfo(
    val brandType: String,
    val price: Float,
    val seats: Int,
    val duration: String,
    val flightsCount: Int,
    val departureDateTime: String,
    val arrivalDateTime: String
)