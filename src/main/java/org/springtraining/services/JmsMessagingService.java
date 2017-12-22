package org.springtraining.services;

public class JmsMessagingService implements MessagingService {

    public void sendMessages(String messages) {
        System.out.println("JMG msg: "+messages);
    }
}
