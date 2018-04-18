package com.spectra.model;

import java.util.UUID;

public class Ticket
{
    private String ticketId;
    private String customerId;
    private String agentId;
    private String message;
    private String messageType;
    private String status;

    public Ticket(String agentId, String customerId, String status)
    {
        this.ticketId = UUID.randomUUID().toString();
        this.agentId = agentId;
        this.customerId = customerId;
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

    public String getMessageType()
    {
        return messageType;
    }

    public void setMessageType(String messageType)
    {
        this.messageType = messageType;
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
