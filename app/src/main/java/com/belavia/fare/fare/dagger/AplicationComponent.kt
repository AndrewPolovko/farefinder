package com.belavia.fare.fare

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [(ApplicationModule::class), /*(RoomModule::class),*/ (NetworkModule::class)]
)
interface ApplicationComponent {

    fun inject(splashActivity: MainActivity)
    fun inject(golfClubListActivity: MapsActivity)
    fun application(): Application
}