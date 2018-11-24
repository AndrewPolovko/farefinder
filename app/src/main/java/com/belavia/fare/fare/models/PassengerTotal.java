package com.belavia.fare.fare.models;

import com.belavia.fare.fare.models.search.Taxes;

import org.json.JSONObject;

public class PassengerTotal {
    private String total;

    private String taxesAmount;

    private String fareAmount;

    private String fareTotal;

    private String taxesTotal;

    private String quantity;

    private String code;

    private Taxes[] taxes;

    private String currency;

    public PassengerTotal(JSONObject json) {
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTaxesAmount() {
        return taxesAmount;
    }

    public void setTaxesAmount(String taxesAmount) {
        this.taxesAmount = taxesAmount;
    }

    public String getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(String fareAmount) {
        this.fareAmount = fareAmount;
    }

    public String getFareTotal() {
        return fareTotal;
    }

    public void setFareTotal(String fareTotal) {
        this.fareTotal = fareTotal;
    }

    public String getTaxesTotal() {
        return taxesTotal;
    }

    public void setTaxesTotal(String taxesTotal) {
        this.taxesTotal = taxesTotal;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Taxes[] getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes[] taxes) {
        this.taxes = taxes;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "ClassPojo [total = " + total + ", taxesAmount = " + taxesAmount + ", fareAmount = " + fareAmount + ", fareTotal = " + fareTotal + ", taxesTotal = " + taxesTotal + ", quantity = " + quantity + ", code = " + code + ", taxes = " + taxes + ", currency = " + currency + "]";
    }
}
