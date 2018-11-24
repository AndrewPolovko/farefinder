package com.belavia.fare.fare.retrofit

import com.belavia.fare.fare.models.FlightInfo


import io.reactivex.Single
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiceHeroku {
  /*
    {
        "date": {
        "start": "2019-01-01"
    },
        "origin": "MSQ",
        "destination": "AMS"
    }*/

    /*   https://farefinder.herokuapp.com/search/fare*/
    @POST("/search/fare/")
    fun search(@Body body: RequestBody): Single<Response<ResponseBody>>



}
