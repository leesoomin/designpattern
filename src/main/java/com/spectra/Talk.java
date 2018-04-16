package com.spectra;

public class Talk
{
    protected Ticket ticket;

    public Talk()
    {
    }

    public void connect()
    {
        Agent agent = new Agent("manager");
        Customer customer = new Customer("smlee");

        ticket = new Ticket(agent, customer, "START");

        System.out.println("agent: " + ticket.getAgentId() + ", customer: " + ticket.getCustomerId() + ", talk status: " + ticket.getStatus());
    }

    public void send(String sender, String msg)
    {
        ticket.setMessage(msg);
        System.out.println("sender: " + sender + ", msg: " + ticket.getMessage());
    }

    public void disconnect()
    {
        ticket.setStatus("END");
        System.out.println("agent: " + ticket.getAgentId() + ", customer: " + ticket.getCustomerId() + ", talk status: " + ticket.getStatus());
    }
}
