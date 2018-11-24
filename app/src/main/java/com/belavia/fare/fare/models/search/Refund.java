package com.belavia.fare.fare.models.search;

public class Refund
{
    private String amount;

    private String isRefundable;

    private String currency;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getIsRefundable ()
    {
        return isRefundable;
    }

    public void setIsRefundable (String isRefundable)
    {
        this.isRefundable = isRefundable;
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
        return "ClassPojo [amount = "+amount+", isRefundable = "+isRefundable+", currency = "+currency+"]";
    }
}
