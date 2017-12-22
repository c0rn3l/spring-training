package org.springtraining.services;

public class KafkaMessagingService implements MessagingService {

    public void sendMessages(String messages) {
        System.out.println("Kafka message: "+messages);
    }
}
