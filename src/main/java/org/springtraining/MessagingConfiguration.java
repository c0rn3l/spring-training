package org.springtraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springtraining.services.JmsMessagingService;
import org.springtraining.services.KafkaMessagingService;
import org.springtraining.services.MessagingService;

@Configuration
@ComponentScan
public class MessagingConfiguration {

    @Bean
    public MessagingService messagingService(MessagingProperties properties){
        switch (properties.getType()){
            case JMS:
                return new JmsMessagingService();
            case KAFKA:
                return new KafkaMessagingService();
            default:
                throw new UnsupportedOperationException("Messaging type not supported: " + properties.getType());
        }
    }

}
