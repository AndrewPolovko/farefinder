package com.belavia.fare.fare.models.search;

public class SearchRequestJs
{
    private String origin;

    private Date date;

    private String destination;

    public String getOrigin ()
    {
        return origin;
    }

    public void setOrigin (String origin)
    {
        this.origin = origin;
    }

    public Date getDate ()
    {
        return date;
    }

    public void setDate (Date date)
    {
        this.date = date;
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
        return "ClassPojo [origin = "+origin+", date = "+date+", destination = "+destination+"]";
    }
}