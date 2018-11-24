package com.belavia.fare.fare.models.searchrequest;

public class PassengerQuantities
{
    private String quantity;

    private String code;

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [quantity = "+quantity+", code = "+code+"]";
    }
}

