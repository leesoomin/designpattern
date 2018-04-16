package com.spectra;

public class Customer
{
    private String customerId;

    public Customer(String customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }
}
