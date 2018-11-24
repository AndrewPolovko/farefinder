package com.belavia.fare.fare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewTreeObserver
import android.widget.RelativeLayout
import com.belavia.fare.fare.models.Flight
import com.belavia.fare.fare.models.FlightInfo

import com.github.sundeepk.compactcalendarview.CompactCalendarView
import com.github.sundeepk.compactcalendarview.domain.Event
import kotlinx.android.synthetic.main.activity_search_calendar.*

import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Date
import java.util.Locale

class SearchCalendarActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    //private val currentCalender = Calendar.getInstance(Locale.getDefault())
    private val dateFormatForMonth = SimpleDateFormat("MMM - yyyy", Locale.getDefault())
    private val selectedDayFlights = ArrayList<FlightInfo>()

    private val flightInfoDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_calendar)

        flights_list.setHasFixedSize(true)
        flights_list.adapter = FlightsListAdapter(selectedDayFlights)

        compactcalendar_view.setUseThreeLetterAbbreviation(false)
        compactcalendar_view.setFirstDayOfWeek(Calendar.MONDAY)
        compactcalendar_view.setIsRtl(false)
        compactcalendar_view.displayOtherMonthDays(false)
        initFlights()
        compactcalendar_view.invalidate()

        supportActionBar?.title = dateFormatForMonth.format(compactcalendar_view.firstDayOfCurrentMonth)

        compactcalendar_view.setListener(object : CompactCalendarView.CompactCalendarViewListener {
            override fun onDayClick(dateClicked: Date) {
                //Set title on calendar scroll
                supportActionBar?.title = dateFormatForMonth.format(dateClicked)
                val dayFlights = compactcalendar_view.getEvents(dateClicked)
                if (dayFlights != null) {
                    Log.d(TAG, dayFlights.toString())
                    selectedDayFlights.clear()
                    for (flight in dayFlights) {
                        selectedDayFlights.add(flight.data as FlightInfo)
                    }
                    flights_list.adapter?.notifyDataSetChanged()
                }

            }

            override fun onMonthScroll(firstDayOfNewMonth: Date) {
                supportActionBar?.title = dateFormatForMonth.format(firstDayOfNewMonth)
            }
        })

        compactcalendar_view.setAnimationListener(object : CompactCalendarView.CompactCalendarAnimationListener {
            override fun onOpened() {}

            override fun onClosed() {}
        })

        openCalendarOnCreate()

    }

    private fun openCalendarOnCreate() {
        val layout = findViewById<RelativeLayout>(R.id.main_content)
        layout.viewTreeObserver
            .addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
                override fun onGlobalLayout() {
                    layout.viewTreeObserver.removeOnGlobalLayoutListener(this)
                    compactcalendar_view.showCalendarWithAnimation()
                }
            })
    }

    public override fun onResume() {
        super.onResume()
        supportActionBar?.title = dateFormatForMonth.format(compactcalendar_view.firstDayOfCurrentMonth)
    }

    private fun initFlights() {
        val flights = ThisApplication.instance?.flights ?: return
        val sortedFlights = List(flights.size)
        { index ->
            Flight(
                flights[index].date,
                flights[index].fligtInfo.sortedBy { it.price }
            )
        }
/*        flights.forEach { flight ->
            flight.fligtInfo.sortedBy {
                it.price
            }
        }*/

        sortedFlights.forEach { flight ->
            flight.fligtInfo.forEach { flightInfo ->
                compactcalendar_view.addEvent(
                    Event(
                        getFareBrandColor(flightInfo.brandType, this),
                        flightInfoDateFormat.parse(flightInfo.departureDateTime).time,
                        flightInfo
                    )
                )
            }
        }
        // Scroll calendar to the first flight date
        sortedFlights.find { flight -> flight.fligtInfo.isNotEmpty() }?.let { flight ->
            val firstFlightDate = Date(flightInfoDateFormat.parse(flight.fligtInfo[0].departureDateTime).time)
            compactcalendar_view.setCurrentDate(firstFlightDate)
            flight.fligtInfo.forEach {
                selectedDayFlights.add(it)
            }
            flights_list.adapter?.notifyDataSetChanged()
        }
    }
}
