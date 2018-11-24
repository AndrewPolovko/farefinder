package com.belavia.fare.fare


import android.app.Application
import dagger.Module
import dagger.Provides
import org.greenrobot.eventbus.EventBus
import javax.inject.Singleton

@Module
class ApplicationModule(val application: ThisApplication) {

    @Provides
    internal fun provideApplication(): Application {
        return application
    }

    @Provides
    @Singleton
    fun provideEventBus(): EventBus {
        return EventBus.getDefault()
    }

    @Provides
    @Singleton
    fun provideCredentialsManager(preferenceHelper: PreferenceHelper): CredentialsManager {
        return CredentialsManager(preferenceHelper, application)
    }
    @Provides
    @Singleton
    fun providePreferenceHelper(): PreferenceHelper {
        return PreferenceHelper(application)
    }
}