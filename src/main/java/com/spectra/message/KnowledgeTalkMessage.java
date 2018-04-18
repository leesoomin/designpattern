package com.spectra.message;

public class KnowledgeTalkMessage implements TalkMessage
{
    @Override
    public String getMessage(String message)
    {
        return "Knowledge message: " + message;
    }
}
