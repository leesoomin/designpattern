package com.spectra.message.factory;

import com.spectra.message.ImageTalkMessage;
import com.spectra.message.KnowledgeTalkMessage;
import com.spectra.message.TalkMessage;
import com.spectra.message.TextTalkMessage;

public class TalkMessageFactory
{
    public TalkMessage message(String msgType)
    {
        TalkMessage talkMessage = null;
        
        if ("TEXT".equals(msgType))
        {
            talkMessage = new TextTalkMessage();
        }
        else if ("IMAGE".equals(msgType))
        {
            talkMessage = new ImageTalkMessage();
        }
        else if ("KNOWLEDGE".equals(msgType))
        {
            talkMessage = new KnowledgeTalkMessage();
        }
        
        return talkMessage;
    }
}
