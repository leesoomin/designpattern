package com.spectra.service;

import com.spectra.message.TalkMessage;
import com.spectra.message.factory.TalkMessageFactory;
import com.spectra.model.Message;
import com.spectra.model.Ticket;

public class TalkService
{
    public TalkService()
    {
    }

    public Ticket newTicket()
    {
        Ticket ticket = new Ticket("manager", "smlee", "START");
        return ticket;
    }

    public void send(String sender, Ticket ticket, Message message)
    {
        TalkMessageFactory factory = new TalkMessageFactory();
        TalkMessage talkMessage = factory.message(message.getType());
        
        String msg = talkMessage.getMessage(message.getContents());
        ticket.setMessage(msg);
        System.out.println("sender: " + sender + ", " + ticket.getMessage());
    }

    public void disconnect(Ticket ticket)
    {
        ticket.setStatus("END");
    }
}
