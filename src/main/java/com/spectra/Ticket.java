package com.spectra;

import java.util.UUID;

public class Ticket
{
    private String ticketId;
    private String customerId;
    private String agentId;
    private String message;
    private String status;

    public Ticket(Agent agent, Customer customer, String status)
    {
        this.agentId = agent.getAgentId();
        this.customerId = customer.getCustomerId();
        this.ticketId = UUID.randomUUID().toString();
        this.status = status;
    }

    public String getTicketId()
    {
        return ticketId;
    }

    public void setTicketId(String ticketId)
    {
        this.ticketId = ticketId;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public String getAgentId()
    {
        return agentId;
    }

    public void setAgentId(String agentId)
    {
        this.agentId = agentId;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
