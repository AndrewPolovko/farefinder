package com.belavia.fare.fare

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View
import android.widget.Toast
import com.belavia.fare.fare.models.Flight
import com.belavia.fare.fare.models.FlightInfo
import com.belavia.fare.fare.models.GrandTotal
import com.belavia.fare.fare.models.search.Date
import com.belavia.fare.fare.models.search.SearchRequestJs
import com.belavia.fare.fare.models.searchrequest.PassengerQuantities
import com.belavia.fare.fare.models.searchrequest.SearchRequest
import com.belavia.fare.fare.models.searchrequest.SearchRoutes
import com.belavia.fare.fare.retrofit.ApiService
import com.belavia.fare.fare.retrofit.ApiServiceHeroku
import com.google.gson.Gson
import com.google.gson.JsonObject
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.BiFunction
import io.reactivex.observers.DisposableObserver
import io.reactivex.observers.DisposableSingleObserver
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    var vzroslyi = 1
    @Inject
    lateinit var apiService: ApiService

    @Inject
    lateinit var apiServiceHeroku: ApiServiceHeroku

    @Inject
    lateinit var credentialsManager: CredentialsManager

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initDagger()
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)


        val json = JsonObject()
        json.addProperty("username", "epam")
        json.addProperty("password", "ptLubE4s8arR2cr6")


        plus.setOnClickListener {
            if (vzroslyi >= 5) {
                return@setOnClickListener
            }
            vzroslyi++
            var str = ""
            str = if (vzroslyi == 1) {
                vzroslyi.toString() + " Взрослый"
            } else {
                vzroslyi.toString() + " Взрослых"
            }
            passengers_input.setText(str)
        }

        minus.setOnClickListener {
            if (vzroslyi <= 1) {
                return@setOnClickListener
            }
            vzroslyi--
            var str = ""
            str = if (vzroslyi == 1) {
                vzroslyi.toString() + " Взрослый"
            } else {
                vzroslyi.toString() + " Взрослых"
            }
            passengers_input.setText(str)
        }


        val formBody = RequestBody.create(MediaType.parse("application/json"), "$json")


        apiService.getToken(formBody).subscribeWith(object : DisposableSingleObserver<Response<ResponseBody>>() {
            override fun onSuccess(response: Response<ResponseBody>) {
                if (response.code() == 200) {
                    val token = response.body()?.string() ?: ""
                    Log.d(TAG, "body $token")
                    credentialsManager.saveToken(token)
                }
            }

            override fun onError(e: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })


        val departureDates = arrayListOf<String>()
        departureDates.add("2019-01-02")
        departureDates.add("2019-01-03")
        departureDates.add("2019-01-04")
        departureDates.add("2019-01-05")
        departureDates.add("2019-01-06")
        departureDates.add("2019-01-07")
        departureDates.add("2019-01-08")
        departureDates.add("2019-01-09")
        departureDates.add("2019-01-10")
        departureDates.add("2019-01-11")
        departureDates.add("2019-01-12")
        departureDates.add("2019-01-13")
        departureDates.add("2019-01-14")
        departureDates.add("2019-01-15")
        departureDates.add("2019-01-16")
        departureDates.add("2019-01-17")
        departureDates.add("2019-01-18")
        departureDates.add("2019-01-19")
        departureDates.add("2019-01-20")
        departureDates.add("2019-01-21")
        departureDates.add("2019-01-22")
        departureDates.add("2019-01-23")
        departureDates.add("2019-01-24")
        departureDates.add("2019-01-25")
        departureDates.add("2019-01-26")
        departureDates.add("2019-01-27")
        departureDates.add("2019-01-28")
        departureDates.add("2019-01-29")
        departureDates.add("2019-01-30")
        departureDates.add("2019-01-31")


        departureDates.add("2019-02-01")
        departureDates.add("2019-02-02")
        departureDates.add("2019-02-03")
        departureDates.add("2019-02-04")
        departureDates.add("2019-02-05")
        departureDates.add("2019-02-06")
        departureDates.add("2019-02-07")
        departureDates.add("2019-02-08")
        departureDates.add("2019-02-09")
        departureDates.add("2019-02-10")
        departureDates.add("2019-02-11")
        departureDates.add("2019-02-12")
        departureDates.add("2019-02-13")
        departureDates.add("2019-02-14")
        departureDates.add("2019-02-15")
        departureDates.add("2019-02-16")
        departureDates.add("2019-02-17")
        departureDates.add("2019-02-18")
        departureDates.add("2019-02-19")
        departureDates.add("2019-02-20")
        departureDates.add("2019-02-21")
        departureDates.add("2019-02-22")
        departureDates.add("2019-02-23")
        departureDates.add("2019-02-24")
        departureDates.add("2019-02-25")
        departureDates.add("2019-02-26")
        departureDates.add("2019-02-27")
        departureDates.add("2019-02-28")

        departureDates.add("2019-03-01")
        departureDates.add("2019-03-02")
        departureDates.add("2019-03-03")
        departureDates.add("2019-03-04")
        departureDates.add("2019-03-05")
        departureDates.add("2019-03-06")
        departureDates.add("2019-03-07")
        departureDates.add("2019-03-08")
        departureDates.add("2019-03-09")
        departureDates.add("2019-03-10")
        departureDates.add("2019-03-11")
        departureDates.add("2019-03-12")
        departureDates.add("2019-03-13")
        departureDates.add("2019-03-14")
        departureDates.add("2019-03-15")
        departureDates.add("2019-03-16")
        departureDates.add("2019-03-17")
        departureDates.add("2019-03-18")
        departureDates.add("2019-03-19")
        departureDates.add("2019-03-20")
        departureDates.add("2019-03-21")
        departureDates.add("2019-03-22")
        departureDates.add("2019-03-23")
        departureDates.add("2019-03-24")
        departureDates.add("2019-03-25")
        departureDates.add("2019-03-26")
        departureDates.add("2019-03-27")
        departureDates.add("2019-03-28")
        departureDates.add("2019-03-29")
        departureDates.add("2019-03-30")
        departureDates.add("2019-03-31")

        departureDates.add("2019-04-01")
        departureDates.add("2019-04-02")
        departureDates.add("2019-04-03")

        direction_input.setOnEditorActionListener { v, actionId, event ->
            if (actionId == 6) {
                pushSearch()
            }
            false
        }


        search.setOnClickListener {
            pushSearch()
        }
    }

    fun pushSearch() {
        whiteopacity.visibility = View.VISIBLE
        val dest = getDestanation(direction_input.text.toString().trim().toUpperCase())
        if (dest.isEmpty()) {
            whiteopacity.visibility = View.GONE
            Toast.makeText(this@MainActivity, "Ошибка ввода", Toast.LENGTH_SHORT).show()
            return
        } else {
            startSearch(dest)
            prototypeText.text = ""
        }
    }


    @SuppressLint("CheckResult")
    fun startSearch(destination: String) {
        val date = Date()
        date.start = "2019-01-02"
        date.end = "2019-04-03"
        val srReq = SearchRequestJs()
        srReq.origin = "MSQ"
        srReq.destination = destination

        srReq.date = date

        val formBodyReq = RequestBody.create(MediaType.parse("application/json"), Gson().toJson(srReq))
        /*    {
                "date": "2019-01-03",
                "flightInfo": [
                {
                    "price": 319.43,
                    "seats": 7,
                    "brand": "ER",
                    "duration": "02:40:00",
                    "departureDateTime": "2019-01-03T10:30:00",
                    "arrivalDateTime": "2019-01-03T10:30:00"
                }
                ]
            }*/
        apiServiceHeroku.search(formBodyReq)
            .observeOn(AndroidSchedulers.mainThread())
            .map { it ->
                val results = arrayListOf<Flight>()
                val array = JSONArray(it.body()?.string())
                for (i in 0..(array.length() - 1)) {
                    val flightInfoArray = arrayListOf<FlightInfo>()
                    val item: JSONObject = array.getJSONObject(i)

                    val jsonArraFlightInfo = item.optJSONArray("flightInfo")
                    for (j in 0..(jsonArraFlightInfo.length() - 1)) {
                        val jsonArraFlightInfoItem: JSONObject = jsonArraFlightInfo.getJSONObject(j)
                        val price = jsonArraFlightInfoItem.optString("price")
                        val seats = jsonArraFlightInfoItem.optInt("seats")
                        val brand = jsonArraFlightInfoItem.optString("brand")
                        val duration = jsonArraFlightInfoItem.optString("duration")
                        val departureDateTime = jsonArraFlightInfoItem.optString("departureDateTime")
                        val arrivalDateTime = jsonArraFlightInfoItem.optString("arrivalDateTime")

                        val flightInfo = FlightInfo(
                            brand, price.toFloat() * vzroslyi,
                            seats, duration,
                            1, departureDateTime,
                            arrivalDateTime
                        )
                        flightInfoArray.add(flightInfo)
                    }

                    val flight = Flight(array.getJSONObject(i).optString("date"), flightInfoArray)
                    results.add(flight)
                }
                results
            }.subscribeWith(object : DisposableSingleObserver<List<Flight>>() {
                override fun onSuccess(result: List<Flight>) {
                    Log.d("TAGTAG", "success2")

                    var i = 1
                    var a = arrayListOf<Float>()
                    for (fl: Flight in result) {
                        Log.d(TAG, "PRICE : " + i++.toString() + "  " + fl.findCheapestPrice())
                        a.add(fl.findCheapestPriceFloat())
                    }
                    whiteopacity.visibility = View.GONE

                    prototypeText.text = a.minBy { it }.toString() + " BYN"

                    ThisApplication.instance?.flights = result
                    val intent = Intent(this@MainActivity, SearchCalendarActivity::class.java)
                    startActivity(intent)

                }

                override fun onError(e: Throwable) {
                }

            })
    }

    @SuppressLint("CheckResult")
    fun searchFlight(
        departureDates: ArrayList<String>,
        formBody: RequestBody,
        requests: ArrayList<Request>
    ) {
        Observable.just(departureDates)
            .flatMap {
                apiService.getToken(formBody)
                    .map { response ->
                        if (response.code() == 200) {
                            val token = response.body()?.string() ?: ""
                            Log.d(TAG, "body $token")
                            credentialsManager.saveToken(token)
                        }
                    }

                Observable.just(it)
            }
            .switchMap {
                var datesData = Single.create<ArrayList<Flight>> { emiter -> emiter.onSuccess(ArrayList()) }

                for (request in requests) {
                    datesData = datesData.zipWith(
                        getFlight(request.date, request.req).onErrorResumeNext(
                            Single.just(Flight(request.date, ArrayList()))
                        ),
                        BiFunction<ArrayList<Flight>, Flight, ArrayList<Flight>> { list, flight ->
                            list.add(flight)
                            list
                        })
                }

                datesData.toObservable()
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(
                object : DisposableObserver<ArrayList<Flight>>() {
                    override fun onComplete() {
                    }

                    override fun onNext(flights: ArrayList<Flight>) {
                        var i = 1
                        var a = arrayListOf<Float>()
                        for (fl: Flight in flights) {
                            Log.d(TAG, "PRICE : " + i++.toString() + "  " + fl.findCheapestPrice())
                            a.add(fl.findCheapestPriceFloat())
                        }

//                        Toast.makeText(this@MainActivity, "success", Toast.LENGTH_SHORT).show()
                        whiteopacity.visibility = View.GONE
                        prototypeText.text = a.minBy { it }.toString() + " BYN"

                        ThisApplication.instance?.flights = flights
                        val intent = Intent(this@MainActivity, SearchCalendarActivity::class.java)
                        startActivity(intent)
                    }

                    override fun onError(e: Throwable) {
                        Log.d(TAG, e.toString())
                    }
                })
    }

    private fun createFormBody(date: String, destination: String): Request {
        val pass = PassengerQuantities()
        val search = SearchRequest()
        val route = SearchRoutes()
        pass.code = "ADT"
        pass.quantity = "1"
        route.origin = "MSQ"
        route.destination = destination
        route.departing = date
        route.direction = "0"
        search.passengerQuantities = arrayOf(pass)
        search.searchRoutes = arrayOf(route)
        search.currency = "BYN"
        return Request(date, RequestBody.create(MediaType.parse("application/json"), Gson().toJson(search)))
    }

    class Request(val date: String, val req: RequestBody)

    private fun getFlight(data: String, request: RequestBody): Single<Flight> {
        return apiService.search(request)
            .map { json ->
                val results = arrayListOf<FlightInfo>()
                val array = JSONArray(json.body()?.string())
                for (i in 0..(array.length() - 1)) {
                    val item: JSONObject = array.getJSONObject(i)
                    val brandsJsonArray = item.optJSONArray("brands")
                    val duration = item.opt("duration").toString()
                    val departureDateTime = item.opt("departureDateTime").toString()
                    val arrivalDateTime = item.opt("arrivalDateTime").toString()
                    val flightsCount = item.optJSONArray("flights").length()
                    for (j in 0..(brandsJsonArray.length() - 1)) {
                        val grandTotalJson = brandsJsonArray.getJSONObject(j)
                        val brandname = grandTotalJson.opt("brand").toString()
                        val seats = grandTotalJson.opt("seats").toString().toInt()
                        if (grandTotalJson != null) {
                            val grandTotal = GrandTotal(grandTotalJson)
                            results.add(
                                FlightInfo(
                                    brandname,
                                    grandTotal.total.toString().toFloat() * vzroslyi,
                                    seats,
                                    duration,
                                    flightsCount,
                                    departureDateTime,
                                    arrivalDateTime

                                )
                            )
                        }
                    }
                }

                Flight(data, results)
            }
    }

    private fun initDagger() {
        ThisApplication.Companion.instance
            ?.applicationComponent
            ?.inject(this)
    }

    companion object {
        const val TAG = "TAG_LOG"
    }

    private fun getDestanation(requestString: String): String {

        var a = arrayListOf<Pair<String, String>>()
        a.add(Pair("Париж", "PAR"))
        a.add(Pair("Амстердам", "AMS"))
        a.add(Pair("Рим", "ROM"))
        a.add(Pair("Прага", "PRG"))
        a.add(Pair("Москва", "MOW"))
        a.add(Pair("Берлин", "BER"))

        a.forEach {
            if (it.first.toUpperCase() == requestString) {
                return it.second
            }
        }

        return ""
    }
}
