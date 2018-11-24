package com.belavia.fare.fare

import com.belavia.fare.fare.retrofit.ApiService
import com.belavia.fare.fare.retrofit.ApiServiceHeroku
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule(val application: ThisApplication) {

    @Provides
    @Singleton
    fun provideHostApiService(@Named(API_BELAVIA) retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideHostApiServiceHeroku(@Named(API_JS) retrofit: Retrofit): ApiServiceHeroku {
        return retrofit.create(ApiServiceHeroku::class.java)
    }


    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }

    @Provides
    @Singleton
    fun provideOkhttpClient(credentialsManager: CredentialsManager): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor { chain ->
                val newRequest = chain.request().newBuilder()
                    .addHeader("Authorization", "Bearer " + credentialsManager.token)
                    .build()
                chain.proceed(newRequest)
            }.build()
    }

    @Provides
    @Singleton
    @Named(API_BELAVIA)
    fun provideRetrofitBelavia(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BELAVIA_HOST)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
//            .addConverterFactory(GsonConverterFactory.create(gson))
            .addConverterFactory(ScalarsConverterFactory.create())
            .client(client)
            .build()

    }


    @Provides
    @Singleton
    @Named(API_JS)
    fun provideRetrofitJS(gson: Gson, client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(JS_HOST)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
    }


    companion object {
        private const val BELAVIA_HOST = "https://api-cert.belavia.by"
        private const val JS_HOST = "https://farefinder.herokuapp.com"

        private const val API_BELAVIA = "API_BELAVIA"
        private const val API_JS = "API_JS"
    }
}