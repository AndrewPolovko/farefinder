package com.belavia.fare.fare.models.search;
/*

[
{
    "exchange": {
    "isExchangeable": true,
    "amount": 0,
    "currency": "string"
},
    "refund": {
    "isRefundable": true,
    "amount": 0,
    "currency": "string"
},
    "flightLegs": [
    {
        "originAirport": {
        "cityId": "string",
        "timeZoneInfo": "string",
        "geonameId": 0,
        "countryCode": "string",
        "countryName": "string",
        "iataCountryCode": "string",
        "iataRegionCode": "string",
        "iataRegionName": "string",
        "trafficConferenceCode": "string",
        "trafficConferenceName": "string"
    },
        "destinationAirport": {
        "cityId": "string",
        "timeZoneInfo": "string",
        "geonameId": 0,
        "countryCode": "string",
        "countryName": "string",
        "iataCountryCode": "string",
        "iataRegionCode": "string",
        "iataRegionName": "string",
        "trafficConferenceCode": "string",
        "trafficConferenceName": "string"
    },
        "aircraft": {
        "name": "string"
    },
        "seatsLeft": 0,
        "direction": 0,
        "rbd": "string",
        "fareBasis": "string",
        "departureDateTimeUtc": "2019-11-23T10:37:58.804Z",
        "arrivalDateTimeUtc": "2019-11-23T10:37:58.804Z",
        "rph": 0,
        "operatingAirline": "string",
        "marketingAirline": "string",
        "flightNumber": 0,
        "marketingFlightNumber": 0,
        "departureDateTime": "2019-11-23T10:37:58.804Z",
        "arrivalDateTime": "2019-11-23T10:37:58.804Z",
        "isCodeShare": true,
        "equipment": "string",
        "isConnection": true,
        "stopQuantity": 0,
        "origin": "string",
        "destination": "string"
    }
    ],
    "fareBrand": {
    "brand": "string",
    "cabin": "string"
},
    "earnPoints": 0,
    "seatsLeft": 0,
    "passengerTotals": [
    {
        "baseAmount": 0,
        "baseCurrency": "string",
        "fareAmount": 0,
        "taxes": [
        {
            "id": "string",
            "originLocation": "string",
            "airline": "string",
            "country": "string",
            "amount": 0,
            "currency": "string"
        }
        ],
        "fareTotal": 0,
        "taxesAmount": 0,
        "taxesTotal": 0,
        "total": 0,
        "code": "string",
        "quantity": 0
    }
    ],
    "total": 0
}
]*/

public class SearchResponse
{
    private String total;

    private String earnPoints;

    private FareBrand fareBrand;

    private Refund refund;

    private String seatsLeft;

    private PassengerTotals[] passengerTotals;

    private Exchange exchange;

    private FlightLegs[] flightLegs;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getEarnPoints ()
    {
        return earnPoints;
    }

    public void setEarnPoints (String earnPoints)
    {
        this.earnPoints = earnPoints;
    }

    public FareBrand getFareBrand ()
    {
        return fareBrand;
    }

    public void setFareBrand (FareBrand fareBrand)
    {
        this.fareBrand = fareBrand;
    }

    public Refund getRefund ()
    {
        return refund;
    }

    public void setRefund (Refund refund)
    {
        this.refund = refund;
    }

    public String getSeatsLeft ()
    {
        return seatsLeft;
    }

    public void setSeatsLeft (String seatsLeft)
    {
        this.seatsLeft = seatsLeft;
    }

    public PassengerTotals[] getPassengerTotals ()
    {
        return passengerTotals;
    }

    public void setPassengerTotals (PassengerTotals[] passengerTotals)
    {
        this.passengerTotals = passengerTotals;
    }

    public Exchange getExchange ()
    {
        return exchange;
    }

    public void setExchange (Exchange exchange)
    {
        this.exchange = exchange;
    }

    public FlightLegs[] getFlightLegs ()
    {
        return flightLegs;
    }

    public void setFlightLegs (FlightLegs[] flightLegs)
    {
        this.flightLegs = flightLegs;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", earnPoints = "+earnPoints+", fareBrand = "+fareBrand+", refund = "+refund+", seatsLeft = "+seatsLeft+", passengerTotals = "+passengerTotals+", exchange = "+exchange+", flightLegs = "+flightLegs+"]";
    }
}