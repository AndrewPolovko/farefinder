package com.belavia.fare.fare.models.search;

public class Taxes
{
    private String amount;

    private String id;

    private String originLocation;

    private String airline;

    private String currency;

    private String country;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getOriginLocation ()
    {
        return originLocation;
    }

    public void setOriginLocation (String originLocation)
    {
        this.originLocation = originLocation;
    }

    public String getAirline ()
    {
        return airline;
    }

    public void setAirline (String airline)
    {
        this.airline = airline;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [amount = "+amount+", id = "+id+", originLocation = "+originLocation+", airline = "+airline+", currency = "+currency+", country = "+country+"]";
    }
}