package com.spectra;

import com.spectra.model.Message;
import com.spectra.model.Ticket;
import com.spectra.service.TalkService;

public class Test
{
    public static void main(String[] args)
    {
        TalkService talkService = new TalkService();
        
        Ticket ticket = talkService.newTicket();
        
        talkService.send(ticket.getCustomerId(), ticket, new Message("안녕하세요", "TEXT"));
        talkService.send(ticket.getAgentId(), ticket, new Message("지식전송", "KNOWLEDGE"));
        talkService.send(ticket.getCustomerId(), ticket, new Message("이미지전송", "IMAGE"));

        talkService.disconnect(ticket);
    }
}
