package com.spectra;

public class Test
{
    public static void main(String[] args)
    {
        Talk talk = new Talk();
        talk.connect();
        talk.send(talk.ticket.getAgentId(), "안녕하세요");
        talk.send(talk.ticket.getCustomerId(), "문의가 있어요");
        talk.disconnect();
    }
}
