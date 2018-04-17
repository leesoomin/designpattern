package com.spectra;

public class Test
{
    public static void main(String[] args)
    {
        Talk talk = new Talk();
        talk.connect();
        talk.send(talk.ticket.getAgentId(), "안녕하세요", "텍스트");
        talk.send(talk.ticket.getCustomerId(), "문의가 있어요", "텍스트");
        talk.send(talk.ticket.getCustomerId(), "이미지 전송합니다", "이미지");
        talk.send(talk.ticket.getAgentId(), "상담지식 전송합니다", "상담지식");
        talk.disconnect();
    }
}
