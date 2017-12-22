package org.springtraining.services;

import org.springframework.stereotype.Component;

@Component
public class MessagingFacade {

    private MessagingService service;

    public MessagingFacade(MessagingService service) {
        this.service = service;
    }

    public void send(String message) {
        service.sendMessages(message);
    }
}
