package org.homework1.service;

import org.homework1.service.builder.MessageBuilder;
import org.homework1.service.storing.StoreService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageStoringService {

    private StoreService storeService;
    private MessageBuilder messageBuilder;

    public MessageStoringService(@Qualifier("hash") StoreService service, MessageBuilder builder){
        this.storeService = service;
        this.messageBuilder = builder;
    }

    public void createMessages(String messageCountString) {
        int messageCount = Integer.valueOf(messageCountString);
        for (int i=0; i<messageCount; i++) {
            storeService.storeMessage(messageBuilder.newInstance());
        }
    }
}
