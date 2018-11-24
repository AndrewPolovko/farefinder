package com.belavia.fare.fare.models.search;

public class Date
{
    private String start;
    private String end;


    public String getStart ()
    {
        return start;
    }

    public String getEnd ()
    {
        return start;
    }


    public void setStart (String start)
    {
        this.start = start;
    }

    public void setEnd (String end)
    {
        this.end = end;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [start = "+start+"]";
    }
}

