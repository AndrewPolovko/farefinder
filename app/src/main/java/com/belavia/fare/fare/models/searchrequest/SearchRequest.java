package com.belavia.fare.fare.models.searchrequest;

public class SearchRequest
{
    private SearchRoutes[] searchRoutes;

    private PassengerQuantities[] passengerQuantities;

    private String currency;

    public SearchRoutes[] getSearchRoutes ()
    {
        return searchRoutes;
    }

    public void setSearchRoutes (SearchRoutes[] searchRoutes)
    {
        this.searchRoutes = searchRoutes;
    }

    public PassengerQuantities[] getPassengerQuantities ()
    {
        return passengerQuantities;
    }

    public void setPassengerQuantities (PassengerQuantities[] passengerQuantities)
    {
        this.passengerQuantities = passengerQuantities;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [searchRoutes = "+searchRoutes+", passengerQuantities = "+passengerQuantities+", currency = "+currency+"]";
    }
}