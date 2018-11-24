package com.belavia.fare.fare

import android.content.Context
import android.support.v4.content.ContextCompat

fun getFareBrandColor(brandType: String, context: Context) = when (brandType) {
    "EP" -> ContextCompat.getColor(context, R.color.economy_promotion)
    "ER" -> ContextCompat.getColor(context, R.color.economy_restriction)
    "SF" -> ContextCompat.getColor(context, R.color.economy_semi_flexible)
    "EF" -> ContextCompat.getColor(context, R.color.economy_flexible)
    "BC" -> ContextCompat.getColor(context, R.color.business)
    else -> {
        ContextCompat.getColor(context, R.color.black)
    }
}