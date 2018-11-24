package com.belavia.fare.fare

import android.annotation.SuppressLint
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.belavia.fare.fare.models.FlightInfo

class FlightsListAdapter(private val flights: ArrayList<FlightInfo>) :
    RecyclerView.Adapter<FlightsListAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val priceTV = view.findViewById<TextView>(R.id.price_tv)
        val departureTV = view.findViewById<TextView>(R.id.departure_tv)
        val durationTV = view.findViewById<TextView>(R.id.duration_tv)
        val arrivalTV = view.findViewById<TextView>(R.id.arrival_tv)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FlightsListAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.flights_list_item, parent, false)
        return MyViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.priceTV.text = "${flights[position].price} BYN"
        val priceColor = getFareBrandColor(flights[position].brandType, holder.priceTV.context)
        holder.priceTV.setTextColor(priceColor)
        holder.departureTV.text = flights[position].departureDateTime.substring(11, 16)
        holder.durationTV.text = "${flights[position].duration.substring(0, 5)}h"
        holder.arrivalTV.text = flights[position].arrivalDateTime.substring(11, 16)
    }

    override fun getItemCount() = flights.size
}