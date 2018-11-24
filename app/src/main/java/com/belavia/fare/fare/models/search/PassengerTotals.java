package com.belavia.fare.fare.models.search;

public class PassengerTotals
{
    private String total;

    private String taxesAmount;

    private String fareAmount;

    private String baseAmount;

    private String fareTotal;

    private String taxesTotal;

    private String baseCurrency;

    private String quantity;

    private String code;

    private Taxes[] taxes;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getTaxesAmount ()
    {
        return taxesAmount;
    }

    public void setTaxesAmount (String taxesAmount)
    {
        this.taxesAmount = taxesAmount;
    }

    public String getFareAmount ()
    {
        return fareAmount;
    }

    public void setFareAmount (String fareAmount)
    {
        this.fareAmount = fareAmount;
    }

    public String getBaseAmount ()
    {
        return baseAmount;
    }

    public void setBaseAmount (String baseAmount)
    {
        this.baseAmount = baseAmount;
    }

    public String getFareTotal ()
    {
        return fareTotal;
    }

    public void setFareTotal (String fareTotal)
    {
        this.fareTotal = fareTotal;
    }

    public String getTaxesTotal ()
    {
        return taxesTotal;
    }

    public void setTaxesTotal (String taxesTotal)
    {
        this.taxesTotal = taxesTotal;
    }

    public String getBaseCurrency ()
    {
        return baseCurrency;
    }

    public void setBaseCurrency (String baseCurrency)
    {
        this.baseCurrency = baseCurrency;
    }

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

    public Taxes[] getTaxes ()
    {
        return taxes;
    }

    public void setTaxes (Taxes[] taxes)
    {
        this.taxes = taxes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", taxesAmount = "+taxesAmount+", fareAmount = "+fareAmount+", baseAmount = "+baseAmount+", fareTotal = "+fareTotal+", taxesTotal = "+taxesTotal+", baseCurrency = "+baseCurrency+", quantity = "+quantity+", code = "+code+", taxes = "+taxes+"]";
    }
}