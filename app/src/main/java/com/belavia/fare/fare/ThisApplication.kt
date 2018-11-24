package com.belavia.fare.fare

import android.app.Application
import com.belavia.fare.fare.models.Flight

class ThisApplication : Application() {
    var applicationComponent: ApplicationComponent? = null
        private set

    var flights: List<Flight>? = null

    override fun onCreate() {
        super.onCreate()

        instance = this

        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .networkModule(NetworkModule(this))
            .build()

    }

    companion object {
        var instance: ThisApplication? = null
            private set
    }
}
