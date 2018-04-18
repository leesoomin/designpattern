package com.spectra.message;

public class TextTalkMessage implements TalkMessage
{
    @Override
    public String getMessage(String message)
    {
        return "Text message: " + message;
    }
}
