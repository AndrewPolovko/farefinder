package com.belavia.fare.fare.retrofit

import io.reactivex.Single
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/Leader/Login")
    fun login(@Body body: RequestBody): Single<Response<Void>>

    @POST("/Search/Outbound")
    fun search(@Body body: RequestBody): Single<Response<ResponseBody>>

    @POST("/Token")
    fun getToken(@Body body: RequestBody): Single<Response<ResponseBody>>
}
