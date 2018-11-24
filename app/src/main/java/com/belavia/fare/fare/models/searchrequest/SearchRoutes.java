package com.belavia.fare.fare.models.searchrequest;


public class SearchRoutes
{
    private String departing;

    private String direction;

    private String origin;

    private String destination;

    public String getDeparting ()
    {
        return departing;
    }

    public void setDeparting (String departing)
    {
        this.departing = departing;
    }

    public String getDirection ()
    {
        return direction;
    }

    public void setDirection (String direction)
    {
        this.direction = direction;
    }

    public String getOrigin ()
    {
        return origin;
    }

    public void setOrigin (String origin)
    {
        this.origin = origin;
    }

    public String getDestination ()
    {
        return destination;
    }

    public void setDestination (String destination)
    {
        this.destination = destination;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [departing = "+departing+", direction = "+direction+", origin = "+origin+", destination = "+destination+"]";
    }
}
