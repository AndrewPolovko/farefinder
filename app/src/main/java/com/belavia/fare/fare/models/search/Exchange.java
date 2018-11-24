package com.belavia.fare.fare.models.search;

public class Exchange
{
    private String amount;

    private String isExchangeable;

    private String currency;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getIsExchangeable ()
    {
        return isExchangeable;
    }

    public void setIsExchangeable (String isExchangeable)
    {
        this.isExchangeable = isExchangeable;
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
        return "ClassPojo [amount = "+amount+", isExchangeable = "+isExchangeable+", currency = "+currency+"]";
    }
}