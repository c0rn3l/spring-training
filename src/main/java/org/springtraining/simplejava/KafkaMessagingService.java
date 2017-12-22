package org.springtraining.simplejava;

import org.springtraining.simplejava.MessagingService;

public class KafkaMessagingService implements MessagingService {

    public void sendMessages(String messages) {
        System.out.println("Kafka message: "+messages);
    }
}
