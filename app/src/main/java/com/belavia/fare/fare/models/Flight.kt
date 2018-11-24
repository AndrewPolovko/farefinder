package com.belavia.fare.fare.models

data class Flight(var date: String, val fligtInfo: List<FlightInfo>) {
    fun findCheapestPrice(): String {
        val res = fligtInfo.minBy { it.price }

        if (res != null) {
            return res.price.toString()
        }
        return "NONE"
    }


    fun findCheapestPriceFloat(): Float {
        val res = fligtInfo.minBy { it.price }

        if (res != null) {
            return res.price
        }
        return 10000f
    }
}
