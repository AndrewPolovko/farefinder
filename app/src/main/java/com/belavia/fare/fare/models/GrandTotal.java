package com.belavia.fare.fare.models;

import org.json.JSONObject;

public class GrandTotal {
    private String total;

    private PassengerTotal[] passengerTotal;

    private String taxTotal;

    private String currency;

    public GrandTotal(JSONObject json){

        taxTotal = json.optString("taxTotal");
        total = json.optString("total");
        currency = json.optString("currency");
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public PassengerTotal[] getPassengerTotal() {
        return passengerTotal;
    }

    public void setPassengerTotal(PassengerTotal[] passengerTotal) {
        this.passengerTotal = passengerTotal;
    }

    public String getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(String taxTotal) {
        this.taxTotal = taxTotal;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "ClassPojo [total = " + total + ", passengerTotal = " + passengerTotal + ", taxTotal = " + taxTotal + ", currency = " + currency + "]";
    }
}
