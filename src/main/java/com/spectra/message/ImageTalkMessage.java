package com.spectra.message;

public class ImageTalkMessage implements TalkMessage
{
    @Override
    public String getMessage(String message)
    {
        return "Image message: " + message;
    }
}
