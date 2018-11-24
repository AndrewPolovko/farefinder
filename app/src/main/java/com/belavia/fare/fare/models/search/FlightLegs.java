package com.belavia.fare.fare.models.search;

public class FlightLegs
{
    private String stopQuantity;

    private OriginAirport originAirport;

    private String direction;

    private String fareBasis;

    private String origin;

    private DestinationAirport destinationAirport;

    private String departureDateTime;

    private String equipment;

    private String flightNumber;

    private String operatingAirline;

    private String destination;

    private String arrivalDateTimeUtc;

    private String departureDateTimeUtc;

    private String isConnection;

    private String arrivalDateTime;

    private Aircraft aircraft;

    private String seatsLeft;

    private String isCodeShare;

    private String marketingAirline;

    private String rbd;

    private String rph;

    private String marketingFlightNumber;

    public String getStopQuantity ()
    {
        return stopQuantity;
    }

    public void setStopQuantity (String stopQuantity)
    {
        this.stopQuantity = stopQuantity;
    }

    public OriginAirport getOriginAirport ()
    {
        return originAirport;
    }

    public void setOriginAirport (OriginAirport originAirport)
    {
        this.originAirport = originAirport;
    }

    public String getDirection ()
    {
        return direction;
    }

    public void setDirection (String direction)
    {
        this.direction = direction;
    }

    public String getFareBasis ()
    {
        return fareBasis;
    }

    public void setFareBasis (String fareBasis)
    {
        this.fareBasis = fareBasis;
    }

    public String getOrigin ()
    {
        return origin;
    }

    public void setOrigin (String origin)
    {
        this.origin = origin;
    }

    public DestinationAirport getDestinationAirport ()
    {
        return destinationAirport;
    }

    public void setDestinationAirport (DestinationAirport destinationAirport)
    {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureDateTime ()
    {
        return departureDateTime;
    }

    public void setDepartureDateTime (String departureDateTime)
    {
        this.departureDateTime = departureDateTime;
    }

    public String getEquipment ()
    {
        return equipment;
    }

    public void setEquipment (String equipment)
    {
        this.equipment = equipment;
    }

    public String getFlightNumber ()
    {
        return flightNumber;
    }

    public void setFlightNumber (String flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirline ()
    {
        return operatingAirline;
    }

    public void setOperatingAirline (String operatingAirline)
    {
        this.operatingAirline = operatingAirline;
    }

    public String getDestination ()
    {
        return destination;
    }

    public void setDestination (String destination)
    {
        this.destination = destination;
    }

    public String getArrivalDateTimeUtc ()
    {
        return arrivalDateTimeUtc;
    }

    public void setArrivalDateTimeUtc (String arrivalDateTimeUtc)
    {
        this.arrivalDateTimeUtc = arrivalDateTimeUtc;
    }

    public String getDepartureDateTimeUtc ()
    {
        return departureDateTimeUtc;
    }

    public void setDepartureDateTimeUtc (String departureDateTimeUtc)
    {
        this.departureDateTimeUtc = departureDateTimeUtc;
    }

    public String getIsConnection ()
    {
        return isConnection;
    }

    public void setIsConnection (String isConnection)
    {
        this.isConnection = isConnection;
    }

    public String getArrivalDateTime ()
    {
        return arrivalDateTime;
    }

    public void setArrivalDateTime (String arrivalDateTime)
    {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Aircraft getAircraft ()
    {
        return aircraft;
    }

    public void setAircraft (Aircraft aircraft)
    {
        this.aircraft = aircraft;
    }

    public String getSeatsLeft ()
    {
        return seatsLeft;
    }

    public void setSeatsLeft (String seatsLeft)
    {
        this.seatsLeft = seatsLeft;
    }

    public String getIsCodeShare ()
    {
        return isCodeShare;
    }

    public void setIsCodeShare (String isCodeShare)
    {
        this.isCodeShare = isCodeShare;
    }

    public String getMarketingAirline ()
    {
        return marketingAirline;
    }

    public void setMarketingAirline (String marketingAirline)
    {
        this.marketingAirline = marketingAirline;
    }

    public String getRbd ()
    {
        return rbd;
    }

    public void setRbd (String rbd)
    {
        this.rbd = rbd;
    }

    public String getRph ()
    {
        return rph;
    }

    public void setRph (String rph)
    {
        this.rph = rph;
    }

    public String getMarketingFlightNumber ()
    {
        return marketingFlightNumber;
    }

    public void setMarketingFlightNumber (String marketingFlightNumber)
    {
        this.marketingFlightNumber = marketingFlightNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [stopQuantity = "+stopQuantity+", originAirport = "+originAirport+", direction = "+direction+", fareBasis = "+fareBasis+", origin = "+origin+", destinationAirport = "+destinationAirport+", departureDateTime = "+departureDateTime+", equipment = "+equipment+", flightNumber = "+flightNumber+", operatingAirline = "+operatingAirline+", destination = "+destination+", arrivalDateTimeUtc = "+arrivalDateTimeUtc+", departureDateTimeUtc = "+departureDateTimeUtc+", isConnection = "+isConnection+", arrivalDateTime = "+arrivalDateTime+", aircraft = "+aircraft+", seatsLeft = "+seatsLeft+", isCodeShare = "+isCodeShare+", marketingAirline = "+marketingAirline+", rbd = "+rbd+", rph = "+rph+", marketingFlightNumber = "+marketingFlightNumber+"]";
    }
}
