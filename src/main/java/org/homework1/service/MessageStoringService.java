package org.homework1.service;

import org.homework1.Message;
import org.homework1.service.builder.MessageBuilder;
import org.homework1.service.storing.StoreService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageStoringService {

    private StoreService storeAsHashService;
    private StoreService storeAsStringService;
    private MessageBuilder messageBuilder;

    public MessageStoringService(@Qualifier("hash") StoreService storeAsHashService,
                                 @Qualifier("text") StoreService storeAsStringService,
                                 MessageBuilder builder){
        this.storeAsHashService = storeAsHashService;
        this.storeAsStringService = storeAsStringService;
        this.messageBuilder = builder;
    }

    public void storeMessages(String messageCountString) {
        int messageCount = Integer.valueOf(messageCountString);
        for (int i=0; i<messageCount; i++) {
            Message message = messageBuilder.newInstance();
            storeAsHashService.storeMessage(message);
            storeAsStringService.storeMessage(message);
        }
    }
}
