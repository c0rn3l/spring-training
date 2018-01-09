package org.homework1.service;

import org.homework1.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageBuilder {

    private StoringService service;

    public MessageBuilder(StoringService service){
        this.service = service;
    }

    public void createMessages(String messageCountString) {
        int messageCount = Integer.valueOf(messageCountString);
        for (int i=0; i<messageCount; i++) {
            service.storeMessage(new Message());
        }
    }
}
