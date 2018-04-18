package com.spectra;

import com.spectra.account.Account;
import com.spectra.model.Message;
import com.spectra.model.Ticket;
import com.spectra.service.TalkService;
import com.spectra.service.work.AdminWorkService;
import com.spectra.service.work.AgentWorkService;
import com.spectra.service.work.IWorkService;
import com.spectra.service.work.ManagerWorkService;

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

        System.out.println("----------------------------");
        System.out.println("상담사가 하는 일?");
        Account account1 = new Account("AGENT");
        account1.accountWork();

        System.out.println("----------------------------");
        System.out.println("매니저가 하는 일?");
        Account account2 = new Account("MANAGER");
        account2.accountWork();

        System.out.println("----------------------------");
        System.out.println("관리자가 하는 일?");
        Account account3 = new Account("ADMIN");
        account3.accountWork();
    }
}
