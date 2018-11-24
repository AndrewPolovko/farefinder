package com.belavia.fare.fare.models.search;

public class FareBrand
{
    private String cabin;

    private String brand;

    public String getCabin ()
    {
        return cabin;
    }

    public void setCabin (String cabin)
    {
        this.cabin = cabin;
    }

    public String getBrand ()
    {
        return brand;
    }

    public void setBrand (String brand)
    {
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cabin = "+cabin+", brand = "+brand+"]";
    }
}